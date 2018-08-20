
package com.abhishek.fundhawk.model.SearchResult;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facets {

    @SerializedName("category")
    @Expose
    private List<Category> category = null;
    @SerializedName("amc")
    @Expose
    private List<Amc> amc = null;
    @SerializedName("sub_category")
    @Expose
    private List<SubCategory> subCategory = null;
    @SerializedName("riskometer")
    @Expose
    private List<Riskometer> riskometer = null;

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public List<Amc> getAmc() {
        return amc;
    }

    public void setAmc(List<Amc> amc) {
        this.amc = amc;
    }

    public List<SubCategory> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(List<SubCategory> subCategory) {
        this.subCategory = subCategory;
    }

    public List<Riskometer> getRiskometer() {
        return riskometer;
    }

    public void setRiskometer(List<Riskometer> riskometer) {
        this.riskometer = riskometer;
    }

}
