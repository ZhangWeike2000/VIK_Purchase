package csxt.lwm.service.impl;

import csxt.entity.Quality;
import csxt.lwm.dao.QualityAuditDao;
import csxt.lwm.dto.QualityAndDetailDto;
import csxt.lwm.dto.ReleaseCargoDetailDto;
import csxt.lwm.service.QualityAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class QualityAuditServiceImpl implements QualityAuditService{
    @Autowired
    private QualityAuditDao qualityAuditDao;

    @Override
    public List<ReleaseCargoDetailDto> selectAllReleaseCargoDetailTag() {
        return qualityAuditDao.selectAllReleaseCargoDetailTag();
    }

    @Transactional
    @Override
    public QualityAndDetailDto selectQualityAndDetailById(int releaseCargoId,int productId) {
        Quality quality = qualityAuditDao.selectQualityByReleaseCargoId(releaseCargoId,productId);
        return new QualityAndDetailDto(quality, qualityAuditDao.selectQualityDetailByQualityId(quality.getId()));
    }

    @Transactional
    @Override
    public void qualityPass(QualityAndDetailDto qualityAndDetailDto) {
        qualityAuditDao.updateQualityDetail(qualityAndDetailDto.getQualityDetails().get(0));
        qualityAuditDao.updateQuality(qualityAndDetailDto.getQuality());
        int releaseCargoDatailId=qualityAuditDao.selectReleaseCargoDatailId(qualityAndDetailDto.getSerialNumber(),new Integer(qualityAndDetailDto.getQuality().getProductId()));
        qualityAuditDao.updateReleaseCargoDatail(releaseCargoDatailId,qualityAndDetailDto.getQuality().getQualifiedNumber());
        qualityAuditDao.updateReleaseCargo(releaseCargoDatailId,qualityAndDetailDto.getSerialNumber());
        qualityAuditDao.updateReleaseCargoCheckTag(qualityAndDetailDto.getSerialNumber());
        String buyerPlanId=qualityAuditDao.selectReleaseCargoBuyerPlanId(qualityAndDetailDto.getSerialNumber());
        if (buyerPlanId!=null){
            String[] buyerExecute=buyerPlanId.split(",");
            for (int i=0;i<buyerExecute.length;i++){
                qualityAuditDao.updateBuyerExecute(new Integer(buyerExecute[i]));
            }
        }
        //生成一个入库单
    }

    @Override
    public void qualityNotPass(QualityAndDetailDto qualityAndDetailDto) {
        qualityAuditDao.updateQualityDetail(qualityAndDetailDto.getQualityDetails().get(0));
        qualityAuditDao.updateQuality(qualityAndDetailDto.getQuality());
        int releaseCargoDatailId=qualityAuditDao.selectReleaseCargoDatailId(qualityAndDetailDto.getSerialNumber(),new Integer(qualityAndDetailDto.getQuality().getProductId()));
        qualityAuditDao.updateReleaseCargoDatail(releaseCargoDatailId,qualityAndDetailDto.getQuality().getQualifiedNumber());
        qualityAuditDao.updateReleaseCargo(releaseCargoDatailId,qualityAndDetailDto.getSerialNumber());
        qualityAuditDao.updateReleaseCargoCheckTagAndDispostTag(qualityAndDetailDto.getSerialNumber());
        //生成一个入库单
    }
}
