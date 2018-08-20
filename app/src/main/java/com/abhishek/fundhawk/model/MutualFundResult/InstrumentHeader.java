
package com.abhishek.fundhawk.model.MutualFundResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InstrumentHeader {

    @SerializedName("instrument")
    @Expose
    private String instrument;
    @SerializedName("allocation_percentage")
    @Expose
    private String allocationPercentage;
    @SerializedName("value")
    @Expose
    private String value;

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getAllocationPercentage() {
        return allocationPercentage;
    }

    public void setAllocationPercentage(String allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
