package csxt.lwm.service.impl;

import csxt.entity.DFile;
import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import csxt.entity.SupplierFile;
import csxt.lwm.dao.ReleaseCargoDao;
import csxt.lwm.dto.ReleaseCargoDto;
import csxt.lwm.service.ReleaseCargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ReleaseCargoServiceImpl implements ReleaseCargoService{
    @Autowired
    private ReleaseCargoDao releaseCargoDao;
    @Override
    public List<SupplierFile> selectAllSupplierFile() {
        return releaseCargoDao.selectAllSupplierFile();
    }

    @Override
    public SupplierFile selectSupplierFileById(int id) {
        return releaseCargoDao.selectSupplierFileById(id);
    }

    @Override
    public List<DFile> selectRecommendByDetail(int supplierId) {
        return releaseCargoDao.selectRecommendByDetail(supplierId);
    }


    @Transactional
    @Override
    public Integer selectExecuteWhetherExist(int productId, int supplierId) {
        //查询这个供应商有没有正在放货该产品，如果有返回已经放货的数量
        Integer sumNumber=releaseCargoDao.selectWhetherBePut(productId,supplierId);
        Integer number=releaseCargoDao.selectExecuteWhetherExist(productId,supplierId);
        if(sumNumber==null||sumNumber.toString()==""){
            if(number==null){
                return 0;
            }else{
                return number;
            }
        }else{
            return number-sumNumber;
        }
    }

    @Override
    public int selectExecuteById(int productId, int supplierId) {
        return releaseCargoDao.selectExecuteById(productId,supplierId);
    }

    @Transactional
    @Override
    public void insertReleaseCargoAndDetails(ReleaseCargoDto releaseCargoDto) {
        releaseCargoDao.insertReleaseCargo(releaseCargoDto.getReleaseCargo());
        for (int i=0;i<releaseCargoDto.getReleaseCargoDetails().size();i++){
            releaseCargoDto.getReleaseCargoDetails().get(i).setReleaseCargoId(releaseCargoDto.getReleaseCargo().getId());
        }
        releaseCargoDao.insertReleaseCargoDetails(releaseCargoDto.getReleaseCargoDetails());
    }


    @Override
    public void updateBuyerExecuteTag(int buyerPlanId) {
        releaseCargoDao.updateBuyerExecuteTag(buyerPlanId);
    }

    @Override
    public void updateBuyerExecuteTagUnequal(int buyerPlanId) {
        releaseCargoDao.updateBuyerExecuteTagUnequal(buyerPlanId);
    }
}
