package com.example.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("VersionNumber")
    @Expose
    private Integer versionNumber;
    @SerializedName("ReleaseNumber")
    @Expose
    private Integer releaseNumber;
    @SerializedName("Source")
    @Expose
    private String source;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Provenance")
    @Expose
    private String provenance;
    @SerializedName("Valid")
    @Expose
    private Object valid;
    @SerializedName("Structure")
    @Expose
    private String structure;

    public Integer getVersionNumber() {
    return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    }

    public Integer getReleaseNumber() {
    return releaseNumber;
    }

    public void setReleaseNumber(Integer releaseNumber) {
    this.releaseNumber = releaseNumber;
    }

    public String getSource() {
    return source;
    }

    public void setSource(String source) {
    this.source = source;
    }

    public String getCreated() {
    return created;
    }

    public void setCreated(String created) {
    this.created = created;
    }

    public String getProvenance() {
    return provenance;
    }

    public void setProvenance(String provenance) {
    this.provenance = provenance;
    }

    public Object getValid() {
    return valid;
    }

    public void setValid(Object valid) {
    this.valid = valid;
    }

    public String getStructure() {
    return structure;
    }

    public void setStructure(String structure) {
    this.structure = structure;
    }

}