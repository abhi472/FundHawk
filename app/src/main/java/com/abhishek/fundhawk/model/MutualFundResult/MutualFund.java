
package com.abhishek.fundhawk.model.MutualFundResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MutualFund {

    @SerializedName("cams_code")
    @Expose
    private String camsCode;
    @SerializedName("last_day_date")
    @Expose
    private String lastDayDate;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("dividend_type")
    @Expose
    private String dividendType;
    @SerializedName("nav_refresh_date")
    @Expose
    private String navRefreshDate;
    @SerializedName("best_return")
    @Expose
    private BestReturn bestReturn;
    @SerializedName("money_control_code")
    @Expose
    private String moneyControlCode;
    @SerializedName("nav")
    @Expose
    private Double nav;
    @SerializedName("details")
    @Expose
    private Details details;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("last_day_nav")
    @Expose
    private Double lastDayNav;
    @SerializedName("nav_change_percentage")
    @Expose
    private Double navChangePercentage;
    @SerializedName("launch_date")
    @Expose
    private String launchDate;
    @SerializedName("dividend_type_text")
    @Expose
    private String dividendTypeText;
    @SerializedName("scheme_id")
    @Expose
    private String schemeId;
    @SerializedName("expense_ratio")
    @Expose
    private Double expenseRatio;

    public String getCamsCode() {
        return camsCode;
    }

    public void setCamsCode(String camsCode) {
        this.camsCode = camsCode;
    }

    public String getLastDayDate() {
        return lastDayDate;
    }

    public void setLastDayDate(String lastDayDate) {
        this.lastDayDate = lastDayDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDividendType() {
        return dividendType;
    }

    public void setDividendType(String dividendType) {
        this.dividendType = dividendType;
    }

    public String getNavRefreshDate() {
        return navRefreshDate;
    }

    public void setNavRefreshDate(String navRefreshDate) {
        this.navRefreshDate = navRefreshDate;
    }

    public BestReturn getBestReturn() {
        return bestReturn;
    }

    public void setBestReturn(BestReturn bestReturn) {
        this.bestReturn = bestReturn;
    }

    public String getMoneyControlCode() {
        return moneyControlCode;
    }

    public void setMoneyControlCode(String moneyControlCode) {
        this.moneyControlCode = moneyControlCode;
    }

    public Double getNav() {
        return nav;
    }

    public void setNav(Double nav) {
        this.nav = nav;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getLastDayNav() {
        return lastDayNav;
    }

    public void setLastDayNav(Double lastDayNav) {
        this.lastDayNav = lastDayNav;
    }

    public Double getNavChangePercentage() {
        return navChangePercentage;
    }

    public void setNavChangePercentage(Double navChangePercentage) {
        this.navChangePercentage = navChangePercentage;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getDividendTypeText() {
        return dividendTypeText;
    }

    public void setDividendTypeText(String dividendTypeText) {
        this.dividendTypeText = dividendTypeText;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public Double getExpenseRatio() {
        return expenseRatio;
    }

    public void setExpenseRatio(Double expenseRatio) {
        this.expenseRatio = expenseRatio;
    }

}
