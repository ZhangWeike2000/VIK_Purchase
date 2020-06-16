package csxt.lwm.service.impl;

import csxt.entity.ReleaseCargo;
import csxt.lwm.dao.ReleaseCargoDisposeDao;
import csxt.lwm.service.ReleaseCargoDisposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReleaseCargoDisposeServiceImpl implements ReleaseCargoDisposeService {
    @Autowired
    private ReleaseCargoDisposeDao releaseCargoDisposeDao;
    @Override
    public List<ReleaseCargo> selectReleaseCargoDispostTag(String supplierId) {
        return releaseCargoDisposeDao.selectReleaseCargoDispostTag(supplierId);
    }
}
