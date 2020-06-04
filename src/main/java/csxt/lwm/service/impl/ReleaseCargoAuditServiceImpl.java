package csxt.lwm.service.impl;

import csxt.entity.ReleaseCargo;
import csxt.lwm.dao.ReleaseCargoAuditDao;
import csxt.lwm.dto.ReleaseCargoDto;
import csxt.lwm.service.ReleaseCargoAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReleaseCargoAuditServiceImpl implements ReleaseCargoAuditService{
    @Autowired
    private ReleaseCargoAuditDao releaseCargoAuditDao;
    @Override
    public List<ReleaseCargo> selectAllReleaseCargo() {
        return releaseCargoAuditDao.selectAllReleaseCargo();
    }

    @Override
    public ReleaseCargoDto selectReleaseCargoAndDetail(Integer id) {
        return new ReleaseCargoDto(releaseCargoAuditDao.selectReleaseCargoById(id),releaseCargoAuditDao.selectReleaseCargoDetailByParent(id));
    }

    @Override
    public void releaseCargoRegRev(ReleaseCargoDto releaseCargoDto) {
        for (int i=0;i<releaseCargoDto.getReleaseCargoDetails().size();i++){
            releaseCargoAuditDao.releaseCargoDetailRegRev(releaseCargoDto.getReleaseCargoDetails().get(i));
        }
        releaseCargoAuditDao.releaseCargoRegRev(releaseCargoDto.getReleaseCargo());
    }

    @Override
    public void releaseCargoRegRevCannot(ReleaseCargoDto releaseCargoDto) {
        int sumNumber=0;
        for (int i=0;i<releaseCargoDto.getReleaseCargoDetails().size();i++){
            releaseCargoAuditDao.releaseCargoDetailRegRev(releaseCargoDto.getReleaseCargoDetails().get(i));
            sumNumber=releaseCargoDto.getReleaseCargoDetails().get(i).getPutNumber();
        }
        releaseCargoDto.getReleaseCargo().setSumNumber(sumNumber);
        releaseCargoAuditDao.releaseCargoRegRev(releaseCargoDto.getReleaseCargo());
        releaseCargoAuditDao.buyerExecuteUpdatePutTag(releaseCargoDto.getReleaseCargo().getBuyerPlanId());
    }

    @Override
    public void releaseCargoNotPass(ReleaseCargo releaseCargo) {
        releaseCargoAuditDao.releaseCargoNotPass(releaseCargo);
        releaseCargoAuditDao.buyerExecuteUpdatePutTag(releaseCargo.getBuyerPlanId());
    }
}
