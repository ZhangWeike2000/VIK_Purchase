package csxt.lwm.controller;

import csxt.entity.ReleaseCargo;
import csxt.lwm.dto.ReleaseCargoDto;
import csxt.lwm.service.ReleaseCargoAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/selectReleaseCargoAndDetail/{releaseCargoId}")
    public ReleaseCargoDto selectReleaseCargoAndDetail(@PathVariable("releaseCargoId") Integer releaseCargoId){
        return releaseCargoAuditService.selectReleaseCargoAndDetail(releaseCargoId);
    }
}
