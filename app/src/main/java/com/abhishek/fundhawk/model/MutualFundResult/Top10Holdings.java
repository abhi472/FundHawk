
package com.abhishek.fundhawk.model.MutualFundResult;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Top10Holdings {

    @SerializedName("header")
    @Expose
    private HoldingHeader header;
    @SerializedName("values")
    @Expose
    private List<Value> values = null;

    public HoldingHeader getHeader() {
        return header;
    }

    public void setHeader(HoldingHeader header) {
        this.header = header;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

}
