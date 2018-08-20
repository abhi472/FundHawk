
package com.abhishek.fundhawk.model.MutualFundResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SectorHeader {

    @SerializedName("sector")
    @Expose
    private String sector;
    @SerializedName("allocation_percentage")
    @Expose
    private String allocationPercentage;
    @SerializedName("value")
    @Expose
    private String value;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
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
