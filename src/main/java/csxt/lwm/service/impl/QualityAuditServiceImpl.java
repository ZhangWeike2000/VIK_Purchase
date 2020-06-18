package csxt.lwm.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import csxt.entity.DFile;
import csxt.entity.Quality;
import csxt.entity.SGather;
import csxt.entity.SGatherDetails;
import csxt.jyx.dao.DFileDao;
import csxt.jyx.dao.SGatherDetailsMapper;
import csxt.jyx.dao.SGatherMapper;
import csxt.lwm.dao.QualityAuditDao;
import csxt.lwm.dto.QualityAndDetailDto;
import csxt.lwm.dto.ReleaseCargoDetailDto;
import csxt.lwm.service.QualityAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class QualityAuditServiceImpl implements QualityAuditService{
    @Autowired
    private QualityAuditDao qualityAuditDao;
    @Resource
    private SGatherMapper sGatherMapper;
    @Resource
    private csxt.jyx.dao.SGatherDetailsMapper SGatherDetailsMapper;
    @Resource
    private DFileDao dFileDao;
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
        DFile dFile = dFileDao.queryById(qualityAndDetailDto.getQuality().getProductId());
        SGather sGather = new SGather();
        sGather.setGatherId(RandomUtil.randomNumbers(10));
        sGather.setStorer(qualityAndDetailDto.getQuality().getChecker());
        sGather.setReason("采购入库");
        sGather.setReasonexact("采购入库");
        sGather.setAmountSum(qualityAndDetailDto.getQualityDetails().get(0).getThisNumber());
        sGather.setCostPriceSum(dFile.getRealCostPrice() * qualityAndDetailDto.getQualityDetails().get(0).getThisNumber());
        sGather.setGatheredAmountSum(0);
        sGather.setRegister(qualityAndDetailDto.getQuality().getRegister());
        sGather.setRegisterTime(DateUtil.now());
        sGather.setChecker(qualityAndDetailDto.getQuality().getChecker());
        sGather.setCheckTime(DateUtil.now());
        sGather.setCheckTag("S001-1");
//        sGather.setAttemper(null);
//        sGather.setAttemperTime(null);
        sGather.setStoreTag("K002-1");
        sGatherMapper.addSGather(sGather);
        List<SGatherDetails> list = new ArrayList<SGatherDetails>();
        SGatherDetails sGatherDetails = new SGatherDetails();
        sGatherDetails.setParentId(sGather.getId());
        sGatherDetails.setProductId(qualityAndDetailDto.getQuality().getProductId());
        sGatherDetails.setProductName(qualityAndDetailDto.getQuality().getProductName());
        sGatherDetails.setAmount(qualityAndDetailDto.getQualityDetails().get(0).getThisNumber());
        sGatherDetails.setCostPrice(dFile.getRealCostPrice());
        sGatherDetails.setSubtotal(dFile.getRealCostPrice() * qualityAndDetailDto.getQualityDetails().get(0).getThisNumber());
        sGatherDetails.setGatherTag("K002-1");
        SGatherDetailsMapper.addSGatherDetails(sGatherDetails);
    }

    @Transactional
    @Override
    public void qualityNotPass(QualityAndDetailDto qualityAndDetailDto) {
        qualityAuditDao.updateQualityDetail(qualityAndDetailDto.getQualityDetails().get(0));
        qualityAuditDao.updateQuality(qualityAndDetailDto.getQuality());
        int releaseCargoDatailId=qualityAuditDao.selectReleaseCargoDatailId(qualityAndDetailDto.getSerialNumber(),new Integer(qualityAndDetailDto.getQuality().getProductId()));
        qualityAuditDao.updateReleaseCargoDatail(releaseCargoDatailId,qualityAndDetailDto.getQuality().getQualifiedNumber());
        qualityAuditDao.updateReleaseCargo(releaseCargoDatailId,qualityAndDetailDto.getSerialNumber());
        qualityAuditDao.updateReleaseCargoCheckTagAndDispostTag(qualityAndDetailDto.getSerialNumber());

        //生成一个入库单
        DFile dFile = dFileDao.queryById(qualityAndDetailDto.getQuality().getProductId());
        SGather sGather = new SGather();
        sGather.setGatherId(RandomUtil.randomNumbers(10));
        sGather.setStorer(qualityAndDetailDto.getQuality().getChecker());
        sGather.setReason("采购入库");
        sGather.setReasonexact("采购入库");
        sGather.setAmountSum(qualityAndDetailDto.getQualityDetails().get(0).getThisNumber());
        sGather.setCostPriceSum(dFile.getRealCostPrice() * qualityAndDetailDto.getQualityDetails().get(0).getThisNumber());
        sGather.setGatheredAmountSum(0);
        sGather.setRegister(qualityAndDetailDto.getQuality().getRegister());
        sGather.setRegisterTime(DateUtil.now());
        sGather.setChecker(qualityAndDetailDto.getQuality().getChecker());
        sGather.setCheckTime(DateUtil.now());
        sGather.setCheckTag("S001-1");
//        sGather.setAttemper(null);
//        sGather.setAttemperTime(null);
        sGather.setStoreTag("K002-1");
        sGatherMapper.addSGather(sGather);
        List<SGatherDetails> list = new ArrayList<SGatherDetails>();
        SGatherDetails sGatherDetails = new SGatherDetails();
        sGatherDetails.setParentId(sGather.getId());
        sGatherDetails.setProductId(qualityAndDetailDto.getQuality().getProductId());
        sGatherDetails.setProductName(qualityAndDetailDto.getQuality().getProductName());
        sGatherDetails.setAmount(qualityAndDetailDto.getQualityDetails().get(0).getThisNumber());
        sGatherDetails.setCostPrice(dFile.getRealCostPrice());
        sGatherDetails.setSubtotal(dFile.getRealCostPrice() * qualityAndDetailDto.getQualityDetails().get(0).getThisNumber());
        sGatherDetails.setGatherTag("K002-1");
        SGatherDetailsMapper.addSGatherDetails(sGatherDetails);
    }
}
