
package com.abhishek.fundhawk.model.MutualFundResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BestReturn {

    @SerializedName("todate")
    @Expose
    private String todate;
    @SerializedName("percent_change")
    @Expose
    private Double percentChange;
    @SerializedName("fromdate")
    @Expose
    private String fromdate;

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public Double getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(Double percentChange) {
        this.percentChange = percentChange;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

}
