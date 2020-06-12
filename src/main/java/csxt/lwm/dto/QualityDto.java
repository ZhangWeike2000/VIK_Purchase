package csxt.lwm.dto;

import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;

import java.util.List;

public class QualityDto {
    private List<ReleaseCargo> releaseCargo;
    private ReleaseCargoDetail releaseCargoDetail;

    public List<ReleaseCargo> getReleaseCargo() {
        return releaseCargo;
    }

    public void setReleaseCargo(List<ReleaseCargo> releaseCargo) {
        this.releaseCargo = releaseCargo;
    }

    public ReleaseCargoDetail getReleaseCargoDetail() {
        return releaseCargoDetail;
    }

    public void setReleaseCargoDetail(ReleaseCargoDetail releaseCargoDetail) {
        this.releaseCargoDetail = releaseCargoDetail;
    }

    public QualityDto() {
    }

    public QualityDto(List<ReleaseCargo> releaseCargo, ReleaseCargoDetail releaseCargoDetail) {
        this.releaseCargo = releaseCargo;
        this.releaseCargoDetail = releaseCargoDetail;
    }
}
