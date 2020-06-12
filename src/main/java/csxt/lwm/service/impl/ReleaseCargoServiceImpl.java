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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ReleaseCargoServiceImpl implements ReleaseCargoService {
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
        //查询执行单需要放货的总数量
        Integer sumNumber = releaseCargoDao.selectWhetherBePut(productId, supplierId);
        //查询该产品正在执行或者准备执行的执行单编号
        List<Integer> integerList = releaseCargoDao.selectBuyerExecuteByProductId(productId);
        String buyerPlanId = "";
        for (int i = 0; i < integerList.size(); i++) {
            if (i == 0) {
                buyerPlanId = buyerPlanId + integerList.get(i);
            } else {
                buyerPlanId = buyerPlanId + "," + integerList.get(i);
            }
        }
        //查询这个执行单的放货数量
        Integer putNumber = releaseCargoDao.selectReleaseCargoPutNumber(buyerPlanId, productId);
        //查询这个执行单的需求数量
        Integer needNumber = releaseCargoDao.selectReleaseCargoNeedNumber(buyerPlanId, productId);
        Integer number = 0;
        if (putNumber != null) {
            number += putNumber;
        }
        if (needNumber != null) {
            number += needNumber;
        }
        //查询这个产品是否有执行单
        //代表这个供应商的这个产品已经全部放货完成
        if (sumNumber == null || sumNumber.toString() == "") {
            return 0;
        } else {
            if (number == null || number.toString() == "") {
                return sumNumber;
            } else {
                return sumNumber - number;
            }
        }
    }

    @Override
    public List<Integer> selectExecuteById(int productId, int supplierId) {
        return releaseCargoDao.selectExecuteById(productId, supplierId);
    }

    @Transactional
    @Override
    public void insertReleaseCargoAndDetails(ReleaseCargoDto releaseCargoDto) {
        releaseCargoDao.insertReleaseCargo(releaseCargoDto.getReleaseCargo());
        for (int i = 0; i < releaseCargoDto.getReleaseCargoDetails().size(); i++) {
            releaseCargoDto.getReleaseCargoDetails().get(i).setReleaseCargoId(releaseCargoDto.getReleaseCargo().getId());
        }
        releaseCargoDao.insertReleaseCargoDetails(releaseCargoDto.getReleaseCargoDetails());
    }


    @Transactional
    @Override
    public void updateBuyerExecuteTag(int productId, int supplierId) {
        String buyerPlanId = releaseCargoDao.selectReleaseCargoIdByProductAndSupplier(productId, supplierId);
        String[] releaseCargoId = buyerPlanId.split(",");
        Integer help = 0;
        for (int i = 0; i < releaseCargoId.length; i++) {
            help = releaseCargoDao.selectBuyerExecuteById(new Integer(releaseCargoId[i]), productId);
            if (help != null) {
                releaseCargoDao.updateBuyerExecuteTag(help);
            }
        }
    }

    @Transactional
    @Override
    public void updateBuyerExecuteTagUnequal(int productId, int supplierId) {
        String buyerPlanId = releaseCargoDao.selectReleaseCargoIdByProductAndSupplier(productId, supplierId);
        String[] releaseCargoId = buyerPlanId.split(",");
        Integer help = 0;
        for (int i = 0; i < releaseCargoId.length; i++) {
            help = releaseCargoDao.selectBuyerExecuteById(new Integer(releaseCargoId[i]), productId);
            if (help != null) {
                releaseCargoDao.updateBuyerExecuteTagUnequal(help);
            }
        }
    }
}
