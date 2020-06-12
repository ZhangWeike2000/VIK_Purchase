package csxt.zwk.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.github.pagehelper.PageInfo;
import csxt.entity.SupplierApproval;
import csxt.entity.SupplierApprovalDetails;
import csxt.entity.SupplierFile;
import csxt.zwk.dao.ApplyForApprovalMapper;
import csxt.zwk.service.ApplyForApprovalService;
import csxt.zwk.vo.ApplicationApprovalDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author mr.z
 * @date 2020/6/3 - 15:07
 */
@RestController
@CrossOrigin //允许所有路径访问（跨域）
public class ApplyForApprovalController {
    /**
     * 服务类
     */
    @Autowired
    private ApplyForApprovalService approvalService;

    /*查询所有的供应商*/
    @GetMapping("/findAllSupplierFile")
    public List<SupplierFile> findAllSupplierFile(String check_tag) {
        return approvalService.selectList(null);
    }

    /*查询所有的物料*/
    @GetMapping("/findAllmaterials")
    public List<Map<String, Object>> findAllmaterials() {
        List<Map<String, Object>> MaterialsAll = approvalService.findMaterials();
        return MaterialsAll;
    }

    /**
     * 分頁
     *
     * @param  currNo, 查询起始位置
     * @param  pageSize 頁面大小
     * @return pageInfo  對象列表
     */
    @GetMapping("/getMaterialsPage/{currNo}/{pageSize}")
    public PageInfo<Map<String, Object>> getMaterialsPage(@PathVariable("currNo") Integer currNo,@PathVariable("pageSize") Integer pageSize) {
        PageInfo<Map<String, Object>> pageInfo = approvalService.getAll(currNo, pageSize);
        return pageInfo;
    }

    /*添加供应商报价单*/
    @PostMapping("/insertSupplierApproval")
    public int insertSupplierApproval(@RequestBody ApplicationApprovalDto applicationApprovalDto) {
        //供应商申请
        int result = approvalService.insertSupplierApproval(applicationApprovalDto);
        return result;
    }

    /*查询未审核的申请登记*/
    @GetMapping("/findAllNoAditSupplierFile")
    public List<SupplierApproval> findAllNoAditSupplierFile(SupplierApproval supplierApproval) {
        return approvalService.findNoAuditSupplierApproval(supplierApproval);
    }

    /*查询未审核的申请登记明细*/
    @PostMapping("/findSupplierApprovalDetails")
    public List<SupplierApprovalDetails> findSupplierApprovalDetails(Integer approvalId) {
        return approvalService.findSupplierApprovalDetails(approvalId);
    }

    /*审核*/
    @PostMapping("/AuditSupplierApproval")
    public int AuditSupplierApproval(@RequestBody ApplicationApprovalDto applicationApprovalDto) {
        return approvalService.AuditSupplierApproval(applicationApprovalDto);
    }

    /*查询审核*/
    @GetMapping("/findAudited")
    public List<SupplierApproval> findAudited(SupplierApproval supplierApproval) {
        return approvalService.findAudited(supplierApproval);
    }
}
