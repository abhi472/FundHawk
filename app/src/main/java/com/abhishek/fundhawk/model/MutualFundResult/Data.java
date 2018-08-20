
package com.abhishek.fundhawk.model.MutualFundResult;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("holdings")
    @Expose
    private Holdings holdings;
    @SerializedName("funds")
    @Expose
    private List<Fund> funds = null;
    @SerializedName("mutual_fund")
    @Expose
    private MutualFund mutualFund;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("block_message")
    @Expose
    private String blockMessage;
    @SerializedName("can_invest")
    @Expose
    private Integer canInvest;
    @SerializedName("is_tax_saving_fund")
    @Expose
    private Boolean isTaxSavingFund;

    public Holdings getHoldings() {
        return holdings;
    }

    public void setHoldings(Holdings holdings) {
        this.holdings = holdings;
    }

    public List<Fund> getFunds() {
        return funds;
    }

    public void setFunds(List<Fund> funds) {
        this.funds = funds;
    }

    public MutualFund getMutualFund() {
        return mutualFund;
    }

    public void setMutualFund(MutualFund mutualFund) {
        this.mutualFund = mutualFund;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBlockMessage() {
        return blockMessage;
    }

    public void setBlockMessage(String blockMessage) {
        this.blockMessage = blockMessage;
    }

    public Integer getCanInvest() {
        return canInvest;
    }

    public void setCanInvest(Integer canInvest) {
        this.canInvest = canInvest;
    }

    public Boolean getIsTaxSavingFund() {
        return isTaxSavingFund;
    }

    public void setIsTaxSavingFund(Boolean isTaxSavingFund) {
        this.isTaxSavingFund = isTaxSavingFund;
    }

}
