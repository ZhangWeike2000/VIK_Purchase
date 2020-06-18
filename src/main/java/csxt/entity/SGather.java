package csxt.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

//##入库表
public class SGather {
  private int id;
  private String gatherId;
  private String storer;
  private String reason;
  private String reasonexact;
  private int amountSum;
  private int costPriceSum;
  private int gatheredAmountSum;
  private String remark;
  private String register;
  private String registerTime;
  private String checker;
  private String checkTime;
  private String checkTag;
  private String attemper;
  private String attemperTime;
  private String storeTag;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getGatherId() {
    return gatherId;
  }

  public void setGatherId(String gatherId) {
    this.gatherId = gatherId;
  }


  public String getStorer() {
    return storer;
  }

  public void setStorer(String storer) {
    this.storer = storer;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public String getReasonexact() {
    return reasonexact;
  }

  public void setReasonexact(String reasonexact) {
    this.reasonexact = reasonexact;
  }


  public int getAmountSum() {
    return amountSum;
  }

  public void setAmountSum(int amountSum) {
    this.amountSum = amountSum;
  }


  public int getCostPriceSum() {
    return costPriceSum;
  }

  public void setCostPriceSum(int costPriceSum) {
    this.costPriceSum = costPriceSum;
  }


  public int getGatheredAmountSum() {
    return gatheredAmountSum;
  }

  public void setGatheredAmountSum(int gatheredAmountSum) {
    this.gatheredAmountSum = gatheredAmountSum;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getRegister() {
    return register;
  }

  public void setRegister(String register) {
    this.register = register;
  }


  public String getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(String registerTime) {
    this.registerTime = registerTime;
  }


  public String getChecker() {
    return checker;
  }

  public void setChecker(String checker) {
    this.checker = checker;
  }


  public String getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(String checkTime) {
    this.checkTime = checkTime;
  }


  public String getCheckTag() {
    return checkTag;
  }

  public void setCheckTag(String checkTag) {
    this.checkTag = checkTag;
  }


  public String getAttemper() {
    return attemper;
  }

  public void setAttemper(String attemper) {
    this.attemper = attemper;
  }


  public String getAttemperTime() {
    return attemperTime;
  }

  public void setAttemperTime(String attemperTime) {
    this.attemperTime = attemperTime;
  }


  public String getStoreTag() {
    return storeTag;
  }

  public void setStoreTag(String storeTag) {
    this.storeTag = storeTag;
  }

}
