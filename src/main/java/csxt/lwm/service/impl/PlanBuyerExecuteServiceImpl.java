package csxt.lwm.service.impl;

import csxt.entity.*;
import csxt.lwm.dao.PlanBuyerExecuteDao;
import csxt.lwm.dto.BuyerExecuteAndDetailDto;
import csxt.lwm.dto.BuyerPlanDetailDto;
import csxt.lwm.service.PlanBuyerExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PlanBuyerExecuteServiceImpl implements PlanBuyerExecuteService{
    @Autowired
    private PlanBuyerExecuteDao planBuyerExecuteDao;
    @Override
    public List<BuyerPlanDetailDto> selectAllBuyerPlanDetail() {
        return planBuyerExecuteDao.selectAllBuyerPlanDetail();
    }

    @Override
    public List<SupplierFile> selectAllSupplierFileRecommend(Integer productId) {
        return planBuyerExecuteDao.selectAllSupplierFileRecommend(productId);
    }

    @Transactional
    @Override
    public void insertBuyerExecuteAndExecuteDetail(BuyerExecuteAndDetailDto buyerExecuteAndDetailDto) {
        //如果这个供应商买这个东西 数量达到了某个值，拿到折扣
        planBuyerExecuteDao.insertBuyerExecute(buyerExecuteAndDetailDto.getBuyerExecute());
        buyerExecuteAndDetailDto.getBuyerExecute().setSumMoney(0);
        SupplierApprovalDetails supplierApprovalDetails;
        for (int i=0;i<buyerExecuteAndDetailDto.getBuyerExecuteDetails().size();i++){
            supplierApprovalDetails=planBuyerExecuteDao.selectSupplierApprovalDetails(buyerExecuteAndDetailDto.getBuyerExecuteDetails().get(i).getSupplierId(),buyerExecuteAndDetailDto.getBuyerExecute().getProductId(),buyerExecuteAndDetailDto.getBuyerExecuteDetails().get(i).getAmount());
            if (supplierApprovalDetails!=null){
                buyerExecuteAndDetailDto.getBuyerExecuteDetails().get(i).setSubtotal(buyerExecuteAndDetailDto.getBuyerExecuteDetails().get(i).getSubtotal()*supplierApprovalDetails.getDiscount()/100);
            }
            buyerExecuteAndDetailDto.getBuyerExecute().setSumMoney(buyerExecuteAndDetailDto.getBuyerExecute().getSumMoney()+buyerExecuteAndDetailDto.getBuyerExecuteDetails().get(i).getSubtotal());
            buyerExecuteAndDetailDto.getBuyerExecuteDetails().get(i).setBuyerExecuteId(buyerExecuteAndDetailDto.getBuyerExecute().getId());
            planBuyerExecuteDao.insertBuyerExecuteDetail(buyerExecuteAndDetailDto.getBuyerExecuteDetails().get(i));
        }
        planBuyerExecuteDao.updateBuyerExecute(buyerExecuteAndDetailDto.getBuyerExecute());
    }

    @Transactional
    @Override
    public void updatyeeBurPlanDetailCheckTag(List<BuyerPlanDetail> buyerPlanDetailList) {
        for (int i=0;i<buyerPlanDetailList.size();i++){
            planBuyerExecuteDao.updatyeeBurPlanDetailCheckTag(buyerPlanDetailList.get(i));
        }
    }

    @Override
    public List<BuyerExecute> selectBuyerExecute() {
        System.out.println(planBuyerExecuteDao.selectBuyerExecute().get(0).toString());
        return planBuyerExecuteDao.selectBuyerExecute();
    }

    @Override
    public List<BuyerExecuteDetail> selectBuyerExecuteDetailByExecuteId(Integer buyerExecuteId) {
        return planBuyerExecuteDao.selectBuyerExecuteDetailByExecuteId(buyerExecuteId);
    }

    @Override
    public void updateBuyerExecuteCheckTag(BuyerExecute buyerExecute) {
        planBuyerExecuteDao.updateBuyerExecuteCheckTag(buyerExecute);
    }
}
