package csxt.lwm.dto;

import csxt.entity.BuyerExecute;
import csxt.entity.BuyerExecuteDetail;

import java.util.List;

public class BuyerExecuteAndDetailDto {
    private BuyerExecute buyerExecute;
    private List<BuyerExecuteDetail> buyerExecuteDetails;

    public BuyerExecute getBuyerExecute() {
        return buyerExecute;
    }

    public void setBuyerExecute(BuyerExecute buyerExecute) {
        this.buyerExecute = buyerExecute;
    }

    public List<BuyerExecuteDetail> getBuyerExecuteDetails() {
        return buyerExecuteDetails;
    }

    public void setBuyerExecuteDetails(List<BuyerExecuteDetail> buyerExecuteDetails) {
        this.buyerExecuteDetails = buyerExecuteDetails;
    }

    public BuyerExecuteAndDetailDto() {
    }

    public BuyerExecuteAndDetailDto(BuyerExecute buyerExecute, List<BuyerExecuteDetail> buyerExecuteDetails) {
        this.buyerExecute = buyerExecute;
        this.buyerExecuteDetails = buyerExecuteDetails;
    }
}
