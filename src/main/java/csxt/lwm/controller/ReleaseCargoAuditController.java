package csxt.lwm.controller;

import csxt.entity.ReleaseCargo;
import csxt.lwm.dto.ReleaseCargoDto;
import csxt.lwm.service.ReleaseCargoAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ReleaseCargoAuditController {
    @Autowired
    private ReleaseCargoAuditService releaseCargoAuditService;

    /**
     * 查询所有未审核的放货登记信息
     * @return 放货登记集合
     */
    @GetMapping("/selectAllReleaseCargo")
    public List<ReleaseCargo> selectAllReleaseCargo(){
        return releaseCargoAuditService.selectAllReleaseCargo();
    }

    /**
     * 审核放货登记信息
     * @param releaseCargoId 放货登记编号
     * @return 放货登记信息和放货登记明细信息
     */
    @GetMapping("/selectReleaseCargoAndDetail/{releaseCargoId}")
    public ReleaseCargoDto selectReleaseCargoAndDetail(@PathVariable("releaseCargoId") Integer releaseCargoId){
        return releaseCargoAuditService.selectReleaseCargoAndDetail(releaseCargoId);
    }

    /**
     * 如果此次审核放货数量等于需求放货的总数
     * @param releaseCargoDto 放货登记信息和放货登记明细信息
     */
    @PutMapping("/releaseCargoRegRev")
    public void releaseCargoRegRev(@RequestBody ReleaseCargoDto releaseCargoDto){
        releaseCargoAuditService.releaseCargoRegRev(releaseCargoDto);
    }

    /**
     * 如果此次审核放货数量小于需求放货的总数
     * @param releaseCargoDto 放货登记信息和放货登记明细信息
     */
    @PutMapping("/releaseCargoRegRevCannot")
    public void releaseCargoRegRevCannot(@RequestBody ReleaseCargoDto releaseCargoDto){
        releaseCargoAuditService.releaseCargoRegRevCannot(releaseCargoDto);
    }

    /**
     * 复核不通过
     * @param releaseCargo 放货信息
     */
    @PutMapping("/releaseCargoNotPass")
    public void releaseCargoNotPass(@RequestBody ReleaseCargo releaseCargo){
        releaseCargoAuditService.releaseCargoNotPass(releaseCargo);
    }
}
