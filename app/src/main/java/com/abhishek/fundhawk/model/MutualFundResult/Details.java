
package com.abhishek.fundhawk.model.MutualFundResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Details {

    @SerializedName("minimum_subscription")
    @Expose
    private Integer minimumSubscription;
    @SerializedName("minimum_balance_maintainence")
    @Expose
    private Integer minimumBalanceMaintainence;
    @SerializedName("asset_aum")
    @Expose
    private String assetAum;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("exit_load_text")
    @Expose
    private String exitLoadText;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("url_name")
    @Expose
    private String urlName;
    @SerializedName("benchmark_text")
    @Expose
    private String benchmarkText;
    @SerializedName("riskometer")
    @Expose
    private String riskometer;
    @SerializedName("sid")
    @Expose
    private Object sid;
    @SerializedName("objective")
    @Expose
    private String objective;
    @SerializedName("minimum_swp_withdrawal")
    @Expose
    private Integer minimumSwpWithdrawal;
    @SerializedName("minimum_redemption")
    @Expose
    private Integer minimumRedemption;
    @SerializedName("exit_load")
    @Expose
    private Integer exitLoad;
    @SerializedName("return_3yr")
    @Expose
    private Double return3yr;
    @SerializedName("multiple_subscription")
    @Expose
    private Integer multipleSubscription;
    @SerializedName("yoy_return")
    @Expose
    private Double yoyReturn;
    @SerializedName("minimum_addition_subscription")
    @Expose
    private Integer minimumAdditionSubscription;
    @SerializedName("amc")
    @Expose
    private Amc amc;
    @SerializedName("scheme_details_id")
    @Expose
    private String schemeDetailsId;
    @SerializedName("benchmark")
    @Expose
    private Benchmark benchmark;
    @SerializedName("value_research_rank")
    @Expose
    private Object valueResearchRank;
    @SerializedName("suitability")
    @Expose
    private String suitability;
    @SerializedName("multiple_redemption")
    @Expose
    private Double multipleRedemption;
    @SerializedName("scheme_type")
    @Expose
    private String schemeType;
    @SerializedName("is_elss")
    @Expose
    private Boolean isElss;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("scheme_class")
    @Expose
    private String schemeClass;
    @SerializedName("return_5yr")
    @Expose
    private Double return5yr;
    @SerializedName("multiple_addition_subscription")
    @Expose
    private Integer multipleAdditionSubscription;
    @SerializedName("sid_url")
    @Expose
    private String sidUrl;
    @SerializedName("minimum_sip_subscription")
    @Expose
    private Integer minimumSipSubscription;

    public Integer getMinimumSubscription() {
        return minimumSubscription;
    }

    public void setMinimumSubscription(Integer minimumSubscription) {
        this.minimumSubscription = minimumSubscription;
    }

    public Integer getMinimumBalanceMaintainence() {
        return minimumBalanceMaintainence;
    }

    public void setMinimumBalanceMaintainence(Integer minimumBalanceMaintainence) {
        this.minimumBalanceMaintainence = minimumBalanceMaintainence;
    }

    public String getAssetAum() {
        return assetAum;
    }

    public void setAssetAum(String assetAum) {
        this.assetAum = assetAum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExitLoadText() {
        return exitLoadText;
    }

    public void setExitLoadText(String exitLoadText) {
        this.exitLoadText = exitLoadText;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getBenchmarkText() {
        return benchmarkText;
    }

    public void setBenchmarkText(String benchmarkText) {
        this.benchmarkText = benchmarkText;
    }

    public String getRiskometer() {
        return riskometer;
    }

    public void setRiskometer(String riskometer) {
        this.riskometer = riskometer;
    }

    public Object getSid() {
        return sid;
    }

    public void setSid(Object sid) {
        this.sid = sid;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Integer getMinimumSwpWithdrawal() {
        return minimumSwpWithdrawal;
    }

    public void setMinimumSwpWithdrawal(Integer minimumSwpWithdrawal) {
        this.minimumSwpWithdrawal = minimumSwpWithdrawal;
    }

    public Integer getMinimumRedemption() {
        return minimumRedemption;
    }

    public void setMinimumRedemption(Integer minimumRedemption) {
        this.minimumRedemption = minimumRedemption;
    }

    public Integer getExitLoad() {
        return exitLoad;
    }

    public void setExitLoad(Integer exitLoad) {
        this.exitLoad = exitLoad;
    }

    public Double getReturn3yr() {
        return return3yr;
    }

    public void setReturn3yr(Double return3yr) {
        this.return3yr = return3yr;
    }

    public Integer getMultipleSubscription() {
        return multipleSubscription;
    }

    public void setMultipleSubscription(Integer multipleSubscription) {
        this.multipleSubscription = multipleSubscription;
    }

    public Double getYoyReturn() {
        return yoyReturn;
    }

    public void setYoyReturn(Double yoyReturn) {
        this.yoyReturn = yoyReturn;
    }

    public Integer getMinimumAdditionSubscription() {
        return minimumAdditionSubscription;
    }

    public void setMinimumAdditionSubscription(Integer minimumAdditionSubscription) {
        this.minimumAdditionSubscription = minimumAdditionSubscription;
    }

    public Amc getAmc() {
        return amc;
    }

    public void setAmc(Amc amc) {
        this.amc = amc;
    }

    public String getSchemeDetailsId() {
        return schemeDetailsId;
    }

    public void setSchemeDetailsId(String schemeDetailsId) {
        this.schemeDetailsId = schemeDetailsId;
    }

    public Benchmark getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(Benchmark benchmark) {
        this.benchmark = benchmark;
    }

    public Object getValueResearchRank() {
        return valueResearchRank;
    }

    public void setValueResearchRank(Object valueResearchRank) {
        this.valueResearchRank = valueResearchRank;
    }

    public String getSuitability() {
        return suitability;
    }

    public void setSuitability(String suitability) {
        this.suitability = suitability;
    }

    public Double getMultipleRedemption() {
        return multipleRedemption;
    }

    public void setMultipleRedemption(Double multipleRedemption) {
        this.multipleRedemption = multipleRedemption;
    }

    public String getSchemeType() {
        return schemeType;
    }

    public void setSchemeType(String schemeType) {
        this.schemeType = schemeType;
    }

    public Boolean getIsElss() {
        return isElss;
    }

    public void setIsElss(Boolean isElss) {
        this.isElss = isElss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchemeClass() {
        return schemeClass;
    }

    public void setSchemeClass(String schemeClass) {
        this.schemeClass = schemeClass;
    }

    public Double getReturn5yr() {
        return return5yr;
    }

    public void setReturn5yr(Double return5yr) {
        this.return5yr = return5yr;
    }

    public Integer getMultipleAdditionSubscription() {
        return multipleAdditionSubscription;
    }

    public void setMultipleAdditionSubscription(Integer multipleAdditionSubscription) {
        this.multipleAdditionSubscription = multipleAdditionSubscription;
    }

    public String getSidUrl() {
        return sidUrl;
    }

    public void setSidUrl(String sidUrl) {
        this.sidUrl = sidUrl;
    }

    public Integer getMinimumSipSubscription() {
        return minimumSipSubscription;
    }

    public void setMinimumSipSubscription(Integer minimumSipSubscription) {
        this.minimumSipSubscription = minimumSipSubscription;
    }

}
