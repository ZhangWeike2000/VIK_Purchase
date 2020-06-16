package csxt.lwm.controller;

import csxt.lwm.dto.QualityAndDetailDto;
import csxt.lwm.dto.ReleaseCargoDetailDto;
import csxt.lwm.service.QualityAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
public class QualityAuditController {
    @Autowired
    private QualityAuditService qualityAuditService;
    /**
     * 查询所有待审核的放货登记明细
     * @return 放货登记明细集合
     */
    @GetMapping("/selectAllReleaseCargoDetailTag")
    public List<ReleaseCargoDetailDto> selectAllReleaseCargoDetailTag(){
        return qualityAuditService.selectAllReleaseCargoDetailTag();
    }

    /**
     * 查询当前质检登记和质检登记明细信息
     * @param releaseCargoId 放货登记编号
     * @return 质检登记信息和质检登记明细信息
     */
    @GetMapping("/selectQualityAndDetailById/{releaseCargoId}/{productId}")
    public QualityAndDetailDto selectQualityAndDetailById(@PathVariable("releaseCargoId") int releaseCargoId, @PathVariable("productId") int productId){
        return qualityAuditService.selectQualityAndDetailById(releaseCargoId,productId);
    }

    @PostMapping("/qualityAndDetailDtoRegRev")
    public void qualityAndDetailDtoRegRev(@RequestBody QualityAndDetailDto qualityAndDetailDto){
        System.out.println(qualityAndDetailDto.getSerialNumber());
        System.out.println(qualityAndDetailDto.getQuality().toString());
        System.out.println(qualityAndDetailDto.getQualityDetails().get(0).toString());
        qualityAuditService.qualityPass(qualityAndDetailDto);
    }
    @PostMapping("/qualityAndDetailDtoRegRevNotPass")
    public void qualityAndDetailDtoRegRevNotPass(@RequestBody QualityAndDetailDto qualityAndDetailDto){
        System.out.println(qualityAndDetailDto.getSerialNumber());
        System.out.println(qualityAndDetailDto.getQuality().toString());
        System.out.println(qualityAndDetailDto.getQualityDetails().get(0).toString());
        qualityAuditService.qualityNotPass(qualityAndDetailDto);
    }
}
