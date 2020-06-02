package csxt.entity;

//##产品档案表
public class DFile {
    private int id;//序号
    private String productId;//产品编号
    private String productName;//产品名称
    private String factoryName;//制造商
    private String firstKindId;//产品I级分类编号
    private String firstKindName;//产品I级分类名称
    private String secondKindId;//产品II级分类编号
    private String secondKindName;//产品II级分类名称
    private String thirdKindId;//产品III级分类编号
    private String thirdKindName;//产品III级分类名称
    private String productNick;//产品简称
    private String type;//用途类型  Y001-1: 商品  Y001-2: 物料
    private String productClass;//档次级别  D001-1: 高档  D001-2: 中档  D001-3: 低档
    private String personalUnit;//计量单位
    private String personalValue;//计量值
    private String providerGroup;//供应商集合
    private String warranty;//保修期
    private String twinName;//替代品名称
    private String twinId;//替代品编号
    private String lifecycle;//生命周期
    private int listPrice;//市场单价
    private int costPrice;//计划成本单价
    private int realCostPrice;//成本单价
    private String amountUnit;//单位
    private String productDescribe;//产品描述
    private String responsiblePerson;//产品经理
    private String register;//登记人
    private String registerTime;//建档时间
    private String checker;//复核人
    private String checkTime;//复核时间
    private String checkTag;//审核标志  S001-0: 等待审核  S001-1: 审核通过  S001-2: 审核不通过
    private String changer;//变更人
    private String changeTime;//变更时间
    private String changeTag;//档案变更标志  D002-0: 未变更  D002-1: 已变更
    private String priceChangeTag;//价格变更标志  J001-0：未变更  J001-1：已变更
    private int fileChangeAmount;//档案变更累计
    private String deleteTag;//产品删除标志 C001-0: 未删除  C001-1: 已删除
    private String designModuleTag;//产品物料组成标志  W001-0: 未设计  W001-1: 已设计
    private String designProcedureTag;//工序组成标志  G001-0: 未设计  G001-1: 已设计
    private String designCellTag;//库存分配标志  K001-0: 未设计  K001-1: 已设计


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }


    public String getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(String firstKindId) {
        this.firstKindId = firstKindId;
    }


    public String getFirstKindName() {
        return firstKindName;
    }

    public void setFirstKindName(String firstKindName) {
        this.firstKindName = firstKindName;
    }


    public String getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(String secondKindId) {
        this.secondKindId = secondKindId;
    }


    public String getSecondKindName() {
        return secondKindName;
    }

    public void setSecondKindName(String secondKindName) {
        this.secondKindName = secondKindName;
    }


    public String getThirdKindId() {
        return thirdKindId;
    }

    public void setThirdKindId(String thirdKindId) {
        this.thirdKindId = thirdKindId;
    }


    public String getThirdKindName() {
        return thirdKindName;
    }

    public void setThirdKindName(String thirdKindName) {
        this.thirdKindName = thirdKindName;
    }


    public String getProductNick() {
        return productNick;
    }

    public void setProductNick(String productNick) {
        this.productNick = productNick;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }


    public String getPersonalUnit() {
        return personalUnit;
    }

    public void setPersonalUnit(String personalUnit) {
        this.personalUnit = personalUnit;
    }


    public String getPersonalValue() {
        return personalValue;
    }

    public void setPersonalValue(String personalValue) {
        this.personalValue = personalValue;
    }


    public String getProviderGroup() {
        return providerGroup;
    }

    public void setProviderGroup(String providerGroup) {
        this.providerGroup = providerGroup;
    }


    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }


    public String getTwinName() {
        return twinName;
    }

    public void setTwinName(String twinName) {
        this.twinName = twinName;
    }


    public String getTwinId() {
        return twinId;
    }

    public void setTwinId(String twinId) {
        this.twinId = twinId;
    }


    public String getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }


    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }


    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }


    public int getRealCostPrice() {
        return realCostPrice;
    }

    public void setRealCostPrice(int realCostPrice) {
        this.realCostPrice = realCostPrice;
    }


    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit;
    }


    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }


    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
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


    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer;
    }


    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime;
    }


    public String getChangeTag() {
        return changeTag;
    }

    public void setChangeTag(String changeTag) {
        this.changeTag = changeTag;
    }


    public String getPriceChangeTag() {
        return priceChangeTag;
    }

    public void setPriceChangeTag(String priceChangeTag) {
        this.priceChangeTag = priceChangeTag;
    }


    public int getFileChangeAmount() {
        return fileChangeAmount;
    }

    public void setFileChangeAmount(int fileChangeAmount) {
        this.fileChangeAmount = fileChangeAmount;
    }


    public String getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(String deleteTag) {
        this.deleteTag = deleteTag;
    }


    public String getDesignModuleTag() {
        return designModuleTag;
    }

    public void setDesignModuleTag(String designModuleTag) {
        this.designModuleTag = designModuleTag;
    }


    public String getDesignProcedureTag() {
        return designProcedureTag;
    }

    public void setDesignProcedureTag(String designProcedureTag) {
        this.designProcedureTag = designProcedureTag;
    }


    public String getDesignCellTag() {
        return designCellTag;
    }

    public void setDesignCellTag(String designCellTag) {
        this.designCellTag = designCellTag;
    }

}
