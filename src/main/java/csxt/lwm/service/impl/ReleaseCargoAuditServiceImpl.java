package csxt.lwm.service.impl;

import csxt.entity.ReleaseCargo;
import csxt.lwm.dao.ReleaseCargoAuditDao;
import csxt.lwm.dto.ReleaseCargoDto;
import csxt.lwm.service.ReleaseCargoAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    @Override
    public void releaseCargoRegRev(ReleaseCargoDto releaseCargoDto) {
        for (int i=0;i<releaseCargoDto.getReleaseCargoDetails().size();i++){
            releaseCargoAuditDao.releaseCargoDetailRegRev(releaseCargoDto.getReleaseCargoDetails().get(i));
        }
        releaseCargoAuditDao.releaseCargoRegRev(releaseCargoDto.getReleaseCargo());
    }

    @Transactional
    @Override
    public void releaseCargoRegRevCannot(ReleaseCargoDto releaseCargoDto) {
        int sumNumber=0;
        String[] buyerPlanId = releaseCargoDto.getReleaseCargo().getBuyerPlanId().split(",");
        for (int i=0;i<releaseCargoDto.getReleaseCargoDetails().size();i++){
            sumNumber+=releaseCargoDto.getReleaseCargoDetails().get(i).getPutNumber();
            if (releaseCargoDto.getReleaseCargoDetails().get(i).getNeedNumber().toString().equals(releaseCargoDto.getReleaseCargoDetails().get(i).getPutNumber().toString())){
                releaseCargoAuditDao.releaseCargoDetailRegRev(releaseCargoDto.getReleaseCargoDetails().get(i));
            }else{
                releaseCargoDto.getReleaseCargoDetails().get(i).setNeedNumber(releaseCargoDto.getReleaseCargoDetails().get(i).getPutNumber());
                for (int j=0;j<buyerPlanId.length;j++){
                    releaseCargoAuditDao.updateBuyerExecutePutTag(new Integer(releaseCargoDto.getReleaseCargoDetails().get(i).getProductId()),new Integer(buyerPlanId[j]));
                }
                releaseCargoAuditDao.releaseCargoDetailRegRev(releaseCargoDto.getReleaseCargoDetails().get(i));
            }
        }
        System.out.println(releaseCargoDto.getReleaseCargo().getBuyerPlanId());
        releaseCargoDto.getReleaseCargo().setSumNumber(sumNumber);
        releaseCargoAuditDao.releaseCargoRegRev(releaseCargoDto.getReleaseCargo());
        //releaseCargoAuditDao.buyerExecuteUpdatePutTag(releaseCargoDto.getReleaseCargo().getBuyerPlanId());
    }

    @Transactional
    @Override
    public void releaseCargoNotPass(ReleaseCargo releaseCargo) {
        releaseCargoAuditDao.releaseCargoNotPass(releaseCargo);
        releaseCargoAuditDao.buyerExecuteUpdatePutTag(releaseCargo.getBuyerPlanId());
    }
}
