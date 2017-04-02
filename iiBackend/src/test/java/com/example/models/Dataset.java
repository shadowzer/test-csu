package com.example.models;

import com.google.gson.Gson;

public class Dataset {
    private long Id;
    private long VersionNumber;
    private long ReleaseNumber;
    private String Caption;
    private long CategoryId;
    private long DepartmentId;
    private String PublishDate;
    private String FullDescription;
    private String Keywords;
    private boolean ContainsGeodata;
    private boolean ContainsAccEnvData;
    private boolean IsForeign;
    private boolean IsSeasonal;
    private String Season;
    private boolean IsArchive;
    private boolean IsNew;
    private String LastUpdateDate;
    private String SefUrl;
    private String IdentificationNumber;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getVersionNumber() {
        return VersionNumber;
    }

    public void setVersionNumber(long versionNumber) {
        VersionNumber = versionNumber;
    }

    public long getReleaseNumber() {
        return ReleaseNumber;
    }

    public void setReleaseNumber(long releaseNumber) {
        ReleaseNumber = releaseNumber;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }

    public long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(long categoryId) {
        CategoryId = categoryId;
    }

    public long getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(long departmentId) {
        DepartmentId = departmentId;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getFullDescription() {
        return FullDescription;
    }

    public void setFullDescription(String fullDescription) {
        FullDescription = fullDescription;
    }

    public String getKeywords() {
        return Keywords;
    }

    public void setKeywords(String keywords) {
        Keywords = keywords;
    }

    public boolean isContainsGeodata() {
        return ContainsGeodata;
    }

    public void setContainsGeodata(boolean containsGeodata) {
        ContainsGeodata = containsGeodata;
    }

    public boolean isContainsAccEnvData() {
        return ContainsAccEnvData;
    }

    public void setContainsAccEnvData(boolean containsAccEnvData) {
        ContainsAccEnvData = containsAccEnvData;
    }

    public boolean isForeign() {
        return IsForeign;
    }

    public void setForeign(boolean foreign) {
        IsForeign = foreign;
    }

    public boolean isSeasonal() {
        return IsSeasonal;
    }

    public void setSeasonal(boolean seasonal) {
        IsSeasonal = seasonal;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public boolean isArchive() {
        return IsArchive;
    }

    public void setArchive(boolean archive) {
        IsArchive = archive;
    }

    public boolean isNew() {
        return IsNew;
    }

    public void setNew(boolean aNew) {
        IsNew = aNew;
    }

    public String getLastUpdateDate() {
        return LastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        LastUpdateDate = lastUpdateDate;
    }

    public String getSefUrl() {
        return SefUrl;
    }

    public void setSefUrl(String sefUrl) {
        SefUrl = sefUrl;
    }

    public String getIdentificationNumber() {
        return IdentificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        IdentificationNumber = identificationNumber;
    }
}
