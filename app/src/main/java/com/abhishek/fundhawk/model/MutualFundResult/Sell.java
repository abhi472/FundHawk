
package com.abhishek.fundhawk.model.MutualFundResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sell {

    @SerializedName("can_sell")
    @Expose
    private Integer canSell;
    @SerializedName("sell_block_message")
    @Expose
    private String sellBlockMessage;

    public Integer getCanSell() {
        return canSell;
    }

    public void setCanSell(Integer canSell) {
        this.canSell = canSell;
    }

    public String getSellBlockMessage() {
        return sellBlockMessage;
    }

    public void setSellBlockMessage(String sellBlockMessage) {
        this.sellBlockMessage = sellBlockMessage;
    }

}
