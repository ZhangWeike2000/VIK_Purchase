package csxt.zwk.controller;

import com.github.pagehelper.PageInfo;
import com.sun.org.apache.regexp.internal.RE;
import csxt.entity.*;
import csxt.zwk.dao.RecommendedMapper;
import csxt.zwk.service.ApplyForApprovalService;
import csxt.zwk.service.RecommendedService;
import csxt.zwk.vo.ApplicationApprovalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author mr.z
 * @date 2020/6/10 - 9:49
 */
@RestController
@CrossOrigin
public class RecommendedContrller {

    /*服务类
     * */
    @Autowired
    private RecommendedService recommendedService;
    @Autowired
    private ApplyForApprovalService approvalService;
    @Resource
    private RecommendedMapper recommendedMapper;

    /**
     * 查询需要推荐的商品
     *
     * @return List<map>
     */
    @GetMapping("/findRecommend")
    public List<Map<String, Object>> findRecommend() {
        return approvalService.findMaterials();

    }

    /**
     * 查询所有供应商
     *
     * @param
     * @return
     */
    @PostMapping("/findAllSupplier")
    public PageInfo<SupplierFile> findAllSupplier(@RequestBody ApplicationApprovalDto applicationApprovalDto) {
        return recommendedService.getAll(applicationApprovalDto);
    }

    /***
     * 供应商推荐提交
     * @param applicationApprovalDto
     * @return
     */
    @PostMapping("/RecommendedToSubmit")
    public int RecommendedToSubmit(@RequestBody ApplicationApprovalDto applicationApprovalDto) {
        return recommendedService.RecommendedToSubmit(applicationApprovalDto);
    }

    /***
     * 查询未审核推荐单
     * @param
     * @return
     */
    @GetMapping("/findNoAuditSupplierRecommend")
    public List<SupplierRecommend> findNoAuditSupplierRecommend() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("check_tag", "S001-0");
        return recommendedMapper.selectByMap(hashMap);
    }

    /***
     * 查询未审核 推荐明细
     * @return
     */
    @GetMapping("/findNoAuditSupplierRecommendDetail/{recommendId}")
    public List<SupplierRecommendDetail> findNoAuditSupplierRecommendDetail(@PathVariable("recommendId") Integer recommendId) {
        return recommendedMapper.findNoAuditSupplierRecommendDetail(recommendId);
    }

    /***
     * 审核
     * @param supplierRecommend
     * @return
     */
    @PostMapping("/AuditSupplierRecommend")
    public int AuditSupplierRecommend(@RequestBody SupplierRecommend supplierRecommend) {
        return recommendedMapper.updateById(supplierRecommend);
    }

    /***
     * 查询
     * @param
     * @return
     */
    @GetMapping("/SelectSupplierRecommend")
    public List<SupplierRecommend> SelectSupplierRecommend() {
        return recommendedMapper.selectList(null);
    }

    /**
     * 统计图报表
     *
     * @return
     */
    @GetMapping("/VCharts")
    public List<Map<String, Object>> VCharts() {
        recommendedService.VCharts();
        return null;
    }

}