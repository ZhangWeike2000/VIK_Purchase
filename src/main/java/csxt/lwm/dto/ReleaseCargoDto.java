package csxt.lwm.dto;

import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;

import java.util.List;

public class ReleaseCargoDto {
    private ReleaseCargo releaseCargo;
    private List<ReleaseCargoDetail> releaseCargoDetails;

    public ReleaseCargoDto() {
    }

    public ReleaseCargoDto(ReleaseCargo releaseCargo, List<ReleaseCargoDetail> releaseCargoDetails) {
        this.releaseCargo = releaseCargo;
        this.releaseCargoDetails = releaseCargoDetails;
    }

    public ReleaseCargo getReleaseCargo() {
        return releaseCargo;
    }

    public void setReleaseCargo(ReleaseCargo releaseCargo) {
        this.releaseCargo = releaseCargo;
    }

    public List<ReleaseCargoDetail> getReleaseCargoDetails() {
        return releaseCargoDetails;
    }

    public void setReleaseCargoDetails(List<ReleaseCargoDetail> releaseCargoDetails) {
        this.releaseCargoDetails = releaseCargoDetails;
    }
}
