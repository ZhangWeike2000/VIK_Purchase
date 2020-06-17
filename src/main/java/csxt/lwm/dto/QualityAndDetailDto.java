package csxt.lwm.dto;

import csxt.entity.Quality;
import csxt.entity.QualityDetail;

import java.util.List;

public class QualityAndDetailDto {
    private Quality quality;
    private List<QualityDetail> qualityDetails;
    private Integer serialNumber;

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public List<QualityDetail> getQualityDetails() {
        return qualityDetails;
    }

    public void setQualityDetails(List<QualityDetail> qualityDetails) {
        this.qualityDetails = qualityDetails;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public QualityAndDetailDto() {
    }

    public QualityAndDetailDto(Quality quality, List<QualityDetail> qualityDetails) {
        this.quality = quality;
        this.qualityDetails = qualityDetails;
    }

    public QualityAndDetailDto(Quality quality, List<QualityDetail> qualityDetails, Integer serialNumber) {
        this.quality = quality;
        this.qualityDetails = qualityDetails;
        this.serialNumber = serialNumber;
    }
}
