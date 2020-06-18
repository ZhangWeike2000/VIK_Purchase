package csxt.lwm.service.impl;

import csxt.entity.BuyerPlanDetail;
import csxt.entity.SupplierFile;
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
        for (int i=0;i<buyerExecuteAndDetailDto.getBuyerExecuteDetails().size();i++){
            buyerExecuteAndDetailDto.getBuyerExecuteDetails().get(i).setBuyerExecuteId(buyerExecuteAndDetailDto.getBuyerExecute().getId());
            planBuyerExecuteDao.insertBuyerExecuteDetail(buyerExecuteAndDetailDto.getBuyerExecuteDetails().get(i));
        }
    }

    @Transactional
    @Override
    public void updatyeeBurPlanDetailCheckTag(List<BuyerPlanDetail> buyerPlanDetailList) {
        for (int i=0;i<buyerPlanDetailList.size();i++){
            planBuyerExecuteDao.updatyeeBurPlanDetailCheckTag(buyerPlanDetailList.get(i));
        }
    }
}
