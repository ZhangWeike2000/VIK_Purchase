package csxt.lwm.controller;

import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import csxt.lwm.dto.ReleaseCargoDto;
import csxt.lwm.service.ReleaseCargoDisposeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ReleaseCargoDisposeController {
    @Autowired
    private ReleaseCargoDisposeService releaseCargoDisposeService;
    @GetMapping("/selectReleaseCargoDispostTag/{supplierId}")
    public List<ReleaseCargo> selectReleaseCargoDispostTag(@PathVariable("supplierId") String supplierId){
        return releaseCargoDisposeService.selectReleaseCargoDispostTag(supplierId);
    }
    @PostMapping("/updateReleaseCargoDispostTag/{id}")
    public void updateReleaseCargoDispostTag(@PathVariable("id") Integer id){
        releaseCargoDisposeService.updateReleaseCargoDisposeTag(id);
    }

    @GetMapping("/selectReleaseCargoDetailReturn/{id}")
    public Integer selectReleaseCargoDetailReturn(@PathVariable("id") Integer id){
        return releaseCargoDisposeService.selectReleaseCargoDetailReturn(id);
    }
    @GetMapping("/selectReleaseCargoDetailQualityPass/{releaseCargoId}")
    public List<ReleaseCargoDetail> selectReleaseCargoDetailQualityPass(@PathVariable("releaseCargoId") Integer releaseCargoId){
        return releaseCargoDisposeService.selectReleaseCargoDetail(releaseCargoId);
    }
    @PostMapping("/sendBackPass")
    public void sendBackPass(@RequestBody ReleaseCargoDto releaseCargoDto){
        System.out.println(releaseCargoDto.getReleaseCargo().toString());
        for (int i=0;i<releaseCargoDto.getReleaseCargoDetails().size();i++){
            System.out.println(releaseCargoDto.getReleaseCargoDetails().get(i).toString());
        }
        releaseCargoDisposeService.sendBackPass(releaseCargoDto);
    }

}
