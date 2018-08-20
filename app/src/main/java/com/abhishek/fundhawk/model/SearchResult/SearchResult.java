
package com.abhishek.fundhawk.model.SearchResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchResult {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("minimum_investment")
    @Expose
    private Integer minimumInvestment;
    @SerializedName("url_name")
    @Expose
    private String urlName;
    @SerializedName("sub_category")
    @Expose
    private String subCategory;
    @SerializedName("scheme_key")
    @Expose
    private String schemeKey;
    @SerializedName("yoy_return")
    @Expose
    private Double yoyReturn;
    @SerializedName("amc")
    @Expose
    private String amc;
    @SerializedName("return_3yr")
    @Expose
    private Double return3yr;
    @SerializedName("return_5yr")
    @Expose
    private Double return5yr;
    @SerializedName("riskometer")
    @Expose
    private String riskometer;
    @SerializedName("details_id")
    @Expose
    private String detailsId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getMinimumInvestment() {
        return minimumInvestment;
    }

    public void setMinimumInvestment(Integer minimumInvestment) {
        this.minimumInvestment = minimumInvestment;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSchemeKey() {
        return schemeKey;
    }

    public void setSchemeKey(String schemeKey) {
        this.schemeKey = schemeKey;
    }

    public Double getYoyReturn() {
        return yoyReturn;
    }

    public void setYoyReturn(Double yoyReturn) {
        this.yoyReturn = yoyReturn;
    }

    public String getAmc() {
        return amc;
    }

    public void setAmc(String amc) {
        this.amc = amc;
    }

    public Double getReturn3yr() {
        return return3yr;
    }

    public void setReturn3yr(Double return3yr) {
        this.return3yr = return3yr;
    }

    public Double getReturn5yr() {
        return return5yr;
    }

    public void setReturn5yr(Double return5yr) {
        this.return5yr = return5yr;
    }

    public String getRiskometer() {
        return riskometer;
    }

    public void setRiskometer(String riskometer) {
        this.riskometer = riskometer;
    }

    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
