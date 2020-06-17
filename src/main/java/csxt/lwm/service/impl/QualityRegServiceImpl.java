package csxt.lwm.service.impl;

import csxt.entity.Quality;
import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import csxt.lwm.dao.QualityRegDao;
import csxt.lwm.dao.ReleaseCargoDao;
import csxt.lwm.dto.QualityAndDetailDto;
import csxt.lwm.dto.QualityDto;
import csxt.lwm.dto.ReleaseCargoDetailDto;
import csxt.lwm.dto.ReleaseCargoDto;
import csxt.lwm.service.QualityRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class QualityRegServiceImpl implements QualityRegService {
    @Autowired
    private QualityRegDao qualityRegDao;

    @Override
    public List<ReleaseCargoDetailDto> selectAllReleaseCargoDetail() {
        return qualityRegDao.selectAllReleaseCargoDetail();
    }

    @Transactional
    @Override
    public QualityDto selectReleaseCargoAndDetail(Integer id) {
        ReleaseCargoDetail releaseCargoDetail = qualityRegDao.selectReleaseCargoDetailByParent(id);
        ReleaseCargo releaseCargo = qualityRegDao.selectReleaseCargoById(releaseCargoDetail.getReleaseCargoId());
        List<ReleaseCargo> releaseCargoList = new ArrayList<ReleaseCargo>();
        releaseCargoList.add(releaseCargo);
        return new QualityDto(releaseCargoList, releaseCargoDetail);
    }

    @Transactional
    @Override
    public void insertQualityAndDetail(QualityAndDetailDto qualityAndDetailDto) {
        qualityRegDao.insertQuality(qualityAndDetailDto.getQuality());
        for (int i = 0; i < qualityAndDetailDto.getQualityDetails().size(); i++) {
            qualityAndDetailDto.getQualityDetails().get(i).setQualityId(qualityAndDetailDto.getQuality().getId());
        }
        qualityRegDao.insertQualityDetail(qualityAndDetailDto.getQualityDetails());
        qualityRegDao.updateReleaseCargoQualityTag(qualityAndDetailDto.getQuality().getReleaseCargoId());
        String[] buyerPlanId = qualityAndDetailDto.getQuality().getBuyerPlanId().split(",");
        Integer buyerExecuteId = 0;
        for (int i = 0; i < buyerPlanId.length; i++) {
            buyerExecuteId = qualityRegDao.selectBuyerExecuteById(buyerPlanId[i], qualityAndDetailDto.getQuality().getProductId());
            if (buyerExecuteId != null) {
                qualityRegDao.updateBuyerExecuteQualityTag(buyerExecuteId.toString());
            }
        }
    }

    @Override
    public void updateReleaseCargoDetail(int id, int thisNumber) {
        qualityRegDao.updateReleaseCargoDetail(id,thisNumber);
    }

}
