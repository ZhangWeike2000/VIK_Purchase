package csxt.lwm.controller;

import csxt.entity.Quality;
import csxt.entity.QualityDetail;
import csxt.lwm.dto.QualityAndDetailDto;
import csxt.lwm.dto.QualityDto;
import csxt.lwm.dto.ReleaseCargoDetailDto;
import csxt.lwm.service.QualityRegService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class QualityRegController {
    @Autowired
    private QualityRegService qualityRegService;

    /**
     * 查询所有未登记的放货登记明细
     * @return 放货登记明细集合
     */
    @GetMapping("/selectAllReleaseCargoDetail")
    public List<ReleaseCargoDetailDto> selectAllReleaseCargoDetail(){
        return qualityRegService.selectAllReleaseCargoDetail();
    }

    /**
     * 查询当前放货登记明细，以及当前放货登记明细的放货登记信息
     * @param id 放货登记明细编号
     * @return 放货登记和放货登记明细
     */
    @GetMapping("/selectReleaseDetailAndCargo/{id}")
    public QualityDto selectReleaseCargoAndDetail(@PathVariable("id") int id){
        return qualityRegService.selectReleaseCargoAndDetail(id);
    }

    /**
     * 审核已经放货的放货信息
     * @param qualityAndDetailDto 质检登记和质检登记明细
     */
    @PostMapping("/qualityRegRev")
    public void select(@RequestBody QualityAndDetailDto qualityAndDetailDto){
        qualityRegService.insertQualityAndDetail(qualityAndDetailDto);
    }
    @PutMapping("/updateReleaseCargoDetail/{id}/{thisNumber}")
    public void updateReleaseCargoDetail(@PathVariable("id") int id,@PathVariable("thisNumber") int thisNumber){
        qualityRegService.updateReleaseCargoDetail(id,thisNumber);
    }

}
