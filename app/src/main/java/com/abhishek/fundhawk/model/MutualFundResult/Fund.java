
package com.abhishek.fundhawk.model.MutualFundResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fund {

    @SerializedName("cams_code")
    @Expose
    private String camsCode;
    @SerializedName("last_day_date")
    @Expose
    private String lastDayDate;
    @SerializedName("dividend_type")
    @Expose
    private String dividendType;
    @SerializedName("plan_type")
    @Expose
    private String planType;
    @SerializedName("nav_refresh_date")
    @Expose
    private String navRefreshDate;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("traditional_sip_details")
    @Expose
    private TraditionalSipDetails traditionalSipDetails;
    @SerializedName("nav")
    @Expose
    private Double nav;
    @SerializedName("expense_ratio")
    @Expose
    private Double expenseRatio;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("last_day_nav")
    @Expose
    private Double lastDayNav;
    @SerializedName("money_control_code")
    @Expose
    private String moneyControlCode;
    @SerializedName("isin")
    @Expose
    private String isin;
    @SerializedName("launch_date")
    @Expose
    private String launchDate;
    @SerializedName("dividend_type_text")
    @Expose
    private String dividendTypeText;
    @SerializedName("scheme_id")
    @Expose
    private String schemeId;
    @SerializedName("close_date")
    @Expose
    private String closeDate;

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

    public String getDividendType() {
        return dividendType;
    }

    public void setDividendType(String dividendType) {
        this.dividendType = dividendType;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getNavRefreshDate() {
        return navRefreshDate;
    }

    public void setNavRefreshDate(String navRefreshDate) {
        this.navRefreshDate = navRefreshDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TraditionalSipDetails getTraditionalSipDetails() {
        return traditionalSipDetails;
    }

    public void setTraditionalSipDetails(TraditionalSipDetails traditionalSipDetails) {
        this.traditionalSipDetails = traditionalSipDetails;
    }

    public Double getNav() {
        return nav;
    }

    public void setNav(Double nav) {
        this.nav = nav;
    }

    public Double getExpenseRatio() {
        return expenseRatio;
    }

    public void setExpenseRatio(Double expenseRatio) {
        this.expenseRatio = expenseRatio;
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

    public String getMoneyControlCode() {
        return moneyControlCode;
    }

    public void setMoneyControlCode(String moneyControlCode) {
        this.moneyControlCode = moneyControlCode;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
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

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

}
