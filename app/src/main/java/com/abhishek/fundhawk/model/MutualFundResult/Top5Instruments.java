
package com.abhishek.fundhawk.model.MutualFundResult;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Top5Instruments {

    @SerializedName("header")
    @Expose
    private InstrumentHeader header;
    @SerializedName("values")
    @Expose
    private List<Object> values = null;

    public InstrumentHeader getHeader() {
        return header;
    }

    public void setHeader(InstrumentHeader header) {
        this.header = header;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

}
