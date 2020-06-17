package csxt.lsy.dto;

import csxt.entity.BuyerPlan;
import csxt.entity.BuyerPlanDetail;

import java.util.List;

public class BuyerPlanDto {
    private BuyerPlan buyerPlan;
    private List<BuyerPlanDetail> buyerPlanDetail;

    public BuyerPlanDto() {
    }

    public BuyerPlanDto(BuyerPlan buyerPlan, List<BuyerPlanDetail> buyerPlanDetail) {
        this.buyerPlan = buyerPlan;
        this.buyerPlanDetail = buyerPlanDetail;
    }

    public BuyerPlan getbPay() {
        return buyerPlan;
    }

    public void setbPay(BuyerPlan buyerPlan) {
        this.buyerPlan = buyerPlan;
    }

    public List<BuyerPlanDetail> getbPayDetails() {
        return buyerPlanDetail;
    }

    public void setbPayDetails(List<BuyerPlanDetail> buyerPlanDetail) {
        this.buyerPlanDetail = buyerPlanDetail;
    }
}
