package csxt.lwm.dto;

import csxt.entity.BuyerPlanDetail;

import java.util.List;

public class BuyerPlanAndDetailDto {
    private List<BuyerPlanDetail> buyerPlanDetails;

    public List<BuyerPlanDetail> getBuyerPlanDetails() {
        return buyerPlanDetails;
    }

    public void setBuyerPlanDetails(List<BuyerPlanDetail> buyerPlanDetails) {
        this.buyerPlanDetails = buyerPlanDetails;
    }

    public BuyerPlanAndDetailDto() {
    }

    public BuyerPlanAndDetailDto(List<BuyerPlanDetail> buyerPlanDetails) {
        this.buyerPlanDetails = buyerPlanDetails;
    }
}
