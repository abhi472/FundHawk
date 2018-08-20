
package com.abhishek.fundhawk.model.MutualFundResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("instrument")
    @Expose
    private String instrument;
    @SerializedName("allocation_percentage")
    @Expose
    private String allocationPercentage;
    @SerializedName("script")
    @Expose
    private String script;

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

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

}
