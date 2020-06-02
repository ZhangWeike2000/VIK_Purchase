package csxt.lwm.service.impl;

import csxt.entity.ReleaseCargo;
import csxt.lwm.dao.ReleaseCargoAuditDao;
import csxt.lwm.service.ReleaseCargoAuditService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReleaseCargoAuditServiceImpl implements ReleaseCargoAuditService{
    @Autowired
    private ReleaseCargoAuditDao releaseCargoAuditDao;
    @Override
    public List<ReleaseCargo> selectAllReleaseCargo() {
        return releaseCargoAuditDao.selectAllReleaseCargo();
    }
}
