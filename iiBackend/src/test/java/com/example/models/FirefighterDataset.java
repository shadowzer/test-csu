package com.example.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirefighterDataset {

    @SerializedName("Standardversion")
    @Expose
    private String standardversion;
    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Identifier")
    @Expose
    private String identifier;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("CategoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("CategoryCaption")
    @Expose
    private String categoryCaption;
    @SerializedName("CreatorId")
    @Expose
    private Integer creatorId;
    @SerializedName("Creator")
    @Expose
    private String creator;
    @SerializedName("Format")
    @Expose
    private String format;
    @SerializedName("VersionNumber")
    @Expose
    private String versionNumber;
    @SerializedName("Valid")
    @Expose
    private String valid;
    @SerializedName("Modified")
    @Expose
    private String modified;
    @SerializedName("Provenance")
    @Expose
    private String provenance;
    @SerializedName("ProvenanceEng")
    @Expose
    private String provenanceEng;
    @SerializedName("Subject")
    @Expose
    private List<String> subject = null;
    @SerializedName("Structure")
    @Expose
    private String structure;
    @SerializedName("Publisher")
    @Expose
    private List<Publisher> publisher = null;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Data")
    @Expose
    private List<Datum> data = null;

    public String getStandardversion() {
    return standardversion;
    }

    public void setStandardversion(String standardversion) {
    this.standardversion = standardversion;
    }

    public Integer getId() {
    return id;
    }

    public void setId(Integer id) {
    this.id = id;
    }

    public String getIdentifier() {
    return identifier;
    }

    public void setIdentifier(String identifier) {
    this.identifier = identifier;
    }

    public String getTitle() {
    return title;
    }

    public void setTitle(String title) {
    this.title = title;
    }

    public String getDescription() {
    return description;
    }

    public void setDescription(String description) {
    this.description = description;
    }

    public Integer getCategoryId() {
    return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }

    public String getCategoryCaption() {
    return categoryCaption;
    }

    public void setCategoryCaption(String categoryCaption) {
    this.categoryCaption = categoryCaption;
    }

    public Integer getCreatorId() {
    return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
    }

    public String getCreator() {
    return creator;
    }

    public void setCreator(String creator) {
    this.creator = creator;
    }

    public String getFormat() {
    return format;
    }

    public void setFormat(String format) {
    this.format = format;
    }

    public String getVersionNumber() {
    return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    }

    public String getValid() {
    return valid;
    }

    public void setValid(String valid) {
    this.valid = valid;
    }

    public String getModified() {
    return modified;
    }

    public void setModified(String modified) {
    this.modified = modified;
    }

    public String getProvenance() {
    return provenance;
    }

    public void setProvenance(String provenance) {
    this.provenance = provenance;
    }

    public String getProvenanceEng() {
    return provenanceEng;
    }

    public void setProvenanceEng(String provenanceEng) {
    this.provenanceEng = provenanceEng;
    }

    public List<String> getSubject() {
    return subject;
    }

    public void setSubject(List<String> subject) {
    this.subject = subject;
    }

    public String getStructure() {
    return structure;
    }

    public void setStructure(String structure) {
    this.structure = structure;
    }

    public List<Publisher> getPublisher() {
    return publisher;
    }

    public void setPublisher(List<Publisher> publisher) {
    this.publisher = publisher;
    }

    public String getCreated() {
    return created;
    }

    public void setCreated(String created) {
    this.created = created;
    }

    public List<Datum> getData() {
    return data;
    }

    public void setData(List<Datum> data) {
    this.data = data;
    }

}