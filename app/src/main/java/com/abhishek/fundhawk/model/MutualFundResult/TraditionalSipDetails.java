
package com.abhishek.fundhawk.model.MutualFundResult;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TraditionalSipDetails {

    @SerializedName("sip_min_installments")
    @Expose
    private Integer sipMinInstallments;
    @SerializedName("traditional_sip_enabled")
    @Expose
    private Integer traditionalSipEnabled;
    @SerializedName("sip_max_installments")
    @Expose
    private Integer sipMaxInstallments;
    @SerializedName("sip_dates")
    @Expose
    private List<Integer> sipDates = null;
    @SerializedName("maximum_sip_amount")
    @Expose
    private Integer maximumSipAmount;
    @SerializedName("minimum_sip_amount")
    @Expose
    private Integer minimumSipAmount;

    public Integer getSipMinInstallments() {
        return sipMinInstallments;
    }

    public void setSipMinInstallments(Integer sipMinInstallments) {
        this.sipMinInstallments = sipMinInstallments;
    }

    public Integer getTraditionalSipEnabled() {
        return traditionalSipEnabled;
    }

    public void setTraditionalSipEnabled(Integer traditionalSipEnabled) {
        this.traditionalSipEnabled = traditionalSipEnabled;
    }

    public Integer getSipMaxInstallments() {
        return sipMaxInstallments;
    }

    public void setSipMaxInstallments(Integer sipMaxInstallments) {
        this.sipMaxInstallments = sipMaxInstallments;
    }

    public List<Integer> getSipDates() {
        return sipDates;
    }

    public void setSipDates(List<Integer> sipDates) {
        this.sipDates = sipDates;
    }

    public Integer getMaximumSipAmount() {
        return maximumSipAmount;
    }

    public void setMaximumSipAmount(Integer maximumSipAmount) {
        this.maximumSipAmount = maximumSipAmount;
    }

    public Integer getMinimumSipAmount() {
        return minimumSipAmount;
    }

    public void setMinimumSipAmount(Integer minimumSipAmount) {
        this.minimumSipAmount = minimumSipAmount;
    }

}
