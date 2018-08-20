
package com.abhishek.fundhawk.model.MutualFundResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Holdings {

    @SerializedName("top_5_sectors")
    @Expose
    private Top5Sectors top5Sectors;
    @SerializedName("top_10_holdings")
    @Expose
    private Top10Holdings top10Holdings;
    @SerializedName("top_5_instruments")
    @Expose
    private Top5Instruments top5Instruments;

    public Top5Sectors getTop5Sectors() {
        return top5Sectors;
    }

    public void setTop5Sectors(Top5Sectors top5Sectors) {
        this.top5Sectors = top5Sectors;
    }

    public Top10Holdings getTop10Holdings() {
        return top10Holdings;
    }

    public void setTop10Holdings(Top10Holdings top10Holdings) {
        this.top10Holdings = top10Holdings;
    }

    public Top5Instruments getTop5Instruments() {
        return top5Instruments;
    }

    public void setTop5Instruments(Top5Instruments top5Instruments) {
        this.top5Instruments = top5Instruments;
    }

}
