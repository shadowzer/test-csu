package com.example.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExportOption {

    @SerializedName("Done")
    @Expose
    private Boolean done;
    @SerializedName("EhdId")
    @Expose
    private String ehdId;
    @SerializedName("FilePath")
    @Expose
    private Object filePath;
    @SerializedName("ReleaseDateTime")
    @Expose
    private String releaseDateTime;
    @SerializedName("FileSize")
    @Expose
    private Integer fileSize;
    @SerializedName("Format")
    @Expose
    private String format;

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getEhdId() {
        return ehdId;
    }

    public void setEhdId(String ehdId) {
        this.ehdId = ehdId;
    }

    public Object getFilePath() {
        return filePath;
    }

    public void setFilePath(Object filePath) {
        this.filePath = filePath;
    }

    public String getReleaseDateTime() {
        return releaseDateTime;
    }

    public void setReleaseDateTime(String releaseDateTime) {
        this.releaseDateTime = releaseDateTime;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
