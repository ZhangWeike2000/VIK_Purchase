package csxt.entity;

//入库明细
public class SGatherDetails {

  private int id;
  private int parentId;
  private String productId;
  private String productName;
  private String productDescribe;
  private int amount;
  private String amountUnit;
  private int costPrice;
  private int subtotal;
  private int gatheredAmount;
  private String gatherTag;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getParentId() {
    return parentId;
  }

  public void setParentId(int parentId) {
    this.parentId = parentId;
  }


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getProductDescribe() {
    return productDescribe;
  }

  public void setProductDescribe(String productDescribe) {
    this.productDescribe = productDescribe;
  }


  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }


  public String getAmountUnit() {
    return amountUnit;
  }

  public void setAmountUnit(String amountUnit) {
    this.amountUnit = amountUnit;
  }


  public int getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(int costPrice) {
    this.costPrice = costPrice;
  }


  public int getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(int subtotal) {
    this.subtotal = subtotal;
  }


  public int getGatheredAmount() {
    return gatheredAmount;
  }

  public void setGatheredAmount(int gatheredAmount) {
    this.gatheredAmount = gatheredAmount;
  }


  public String getGatherTag() {
    return gatherTag;
  }

  public void setGatherTag(String gatherTag) {
    this.gatherTag = gatherTag;
  }

}
