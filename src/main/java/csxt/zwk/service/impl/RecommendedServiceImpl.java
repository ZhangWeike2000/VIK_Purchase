package csxt.zwk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import csxt.entity.SupplierApprovalDetails;
import csxt.entity.SupplierFile;
import csxt.entity.SupplierRecommendDetail;
import csxt.zwk.dao.RecommendedMapper;
import csxt.zwk.service.RecommendedService;
import csxt.zwk.utils.SnowflakeIdWorker;
import csxt.zwk.vo.ApplicationApprovalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.jta.WebSphereUowTransactionManager;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * @author mr.z
 * @date 2020/6/10 - 9:47
 */
@Service
public class RecommendedServiceImpl implements RecommendedService {

    /**
     * 服务类
     */
    @Autowired
    private RecommendedMapper recommendedMapper;

    /**
     * 查询所有供应商
     *
     * @param
     * @return
     */
    @Override
    public List<SupplierFile> findAllSupplier(Integer productId) {
        return recommendedMapper.findAllSupplier(productId);
    }

    /**
     * 查詢指定行
     *
     * @param offset
     * @param limit
     * @return
     */
    @Override
    public List<SupplierFile> queryAllByLimit(int offset, int limit) {
        return recommendedMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 進行分頁
     *
     * @param
     * @param
     * @return
     */
    @Override
    public PageInfo<SupplierFile> getAll(ApplicationApprovalDto applicationApprovalDto) {
        PageHelper.startPage(applicationApprovalDto.getCurrNo(), applicationApprovalDto.getPageSize());
        PageInfo pageInfo = new PageInfo(this.recommendedMapper.findAllSupplier(applicationApprovalDto.getProductId()));
        return pageInfo;
    }

    /***
     * 供应商推荐登记
     * @param applicationApprovalDto
     * @return
     */
    @Override
    @Transactional//添加事务
    public int RecommendedToSubmit(ApplicationApprovalDto applicationApprovalDto) {
        //供应商推荐
        int rs = recommendedMapper.submitRecommend(applicationApprovalDto.getSupplierRecommend());
        for (SupplierRecommendDetail list : applicationApprovalDto.getSupplierRecommendDetails()) {
            list.setSupplierId(list.getId());
            list.setId(0);
            list.setRecommendId(applicationApprovalDto.getSupplierRecommend().getId());
            //供应商推荐明细
            System.out.println(list);
            recommendedMapper.submitRecommendDetail(list);
        }
        return rs;
    }

    /***
     * 统计图
     * @return
     */
    @Override
    public List<Map> VCharts() {
        //当前时间
        LocalDate date = LocalDate.now();
        //等到近七天
        HashMap<String,Object> list = null;
        ArrayList<Map> arrayList = new ArrayList<>();
        for (int i = 7; i >= 1; i--) {
            list=new HashMap<>();
            list.put("日期",date.minusDays(i - 1).toString());
            Long number= recommendedMapper.VCharts(i - 1);
            if (number==null){
                number=0L;
            }
            list.put("总数量",number);
            arrayList.add(list);
        }
        System.out.println(arrayList);
        return arrayList;
    }
}
