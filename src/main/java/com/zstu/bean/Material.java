package com.zstu.bean;

import java.util.Date;

public class Material {
    private Integer id;

    private String materialTitle;

    private Date createTime;

    private Integer teacherId;

    private Integer courseId;

    private Integer downloadTimes;

    private String materialFileName;

    private String materialFilePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialTitle() {
        return materialTitle;
    }

    public void setMaterialTitle(String materialTitle) {
        this.materialTitle = materialTitle == null ? null : materialTitle.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getDownloadTimes() {
        return downloadTimes;
    }

    public void setDownloadTimes(Integer downloadTimes) {
        this.downloadTimes = downloadTimes;
    }

    public String getMaterialFileName() {
        return materialFileName;
    }

    public void setMaterialFileName(String materialFileName) {
        this.materialFileName = materialFileName == null ? null : materialFileName.trim();
    }

    public String getMaterialFilePath() {
        return materialFilePath;
    }

    public void setMaterialFilePath(String materialFilePath) {
        this.materialFilePath = materialFilePath == null ? null : materialFilePath.trim();
    }
}