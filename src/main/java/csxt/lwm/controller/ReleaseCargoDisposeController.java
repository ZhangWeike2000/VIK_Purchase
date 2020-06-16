package csxt.lwm.controller;

import csxt.entity.ReleaseCargo;
import csxt.lwm.service.ReleaseCargoDisposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
