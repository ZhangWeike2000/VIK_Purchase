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
}
