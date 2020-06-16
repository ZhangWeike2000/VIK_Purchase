package csxt.lwm.service.impl;

import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import csxt.lwm.dao.ReleaseCargoDao;
import csxt.lwm.dao.ReleaseCargoDisposeDao;
import csxt.lwm.dto.ReleaseCargoDto;
import csxt.lwm.service.ReleaseCargoDisposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ReleaseCargoDisposeServiceImpl implements ReleaseCargoDisposeService{
    @Autowired
    private ReleaseCargoDisposeDao releaseCargoDisposeDao;
    @Autowired
    private ReleaseCargoDao releaseCargoDao;
    @Override
    public List<ReleaseCargo> selectReleaseCargoDispostTag(String supplierId) {
        return releaseCargoDisposeDao.selectReleaseCargoDispostTag(supplierId);
    }

    @Override
    public void updateReleaseCargoDisposeTag(Integer id) {
        releaseCargoDisposeDao.updateReleaseCargoDisposeTag(id);
    }

    @Override
    public Integer selectReleaseCargoDetailReturn(Integer id) {
        return releaseCargoDisposeDao.selectReleaseCargoDetailReturn(id);
    }

    @Override
    public List<ReleaseCargoDetail> selectReleaseCargoDetail(Integer releaseCargoId) {
        return releaseCargoDisposeDao.selectReleaseCargoDetail(releaseCargoId);
    }

    @Transactional
    @Override
    public void sendBackPass(ReleaseCargoDto releaseCargoDto) {
        releaseCargoDisposeDao.updateReleaseCargoDisposeTagPass(releaseCargoDto.getReleaseCargo().getId());
        releaseCargoDao.insertReleaseCargo(releaseCargoDto.getReleaseCargo());
        for (int i=0;i<releaseCargoDto.getReleaseCargoDetails().size();i++){
            releaseCargoDisposeDao.updateReleaseCargoDetailQualityNumber(releaseCargoDto.getReleaseCargoDetails().get(i));
            releaseCargoDto.getReleaseCargoDetails().get(i).setReleaseCargoId(releaseCargoDto.getReleaseCargo().getId());
        }
        releaseCargoDao.insertReleaseCargoDetails(releaseCargoDto.getReleaseCargoDetails());
    }

}
