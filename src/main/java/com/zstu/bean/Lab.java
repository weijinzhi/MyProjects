package com.zstu.bean;

public class Lab {
    private Integer id;

    private String labNum;

    private String labType;

    private Integer labCap;

    private String locate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabNum() {
        return labNum;
    }

    public void setLabNum(String labNum) {
        this.labNum = labNum == null ? null : labNum.trim();
    }

    public String getLabType() {
        return labType;
    }

    public void setLabType(String labType) {
        this.labType = labType == null ? null : labType.trim();
    }

    public Integer getLabCap() {
        return labCap;
    }

    public void setLabCap(Integer labCap) {
        this.labCap = labCap;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate == null ? null : locate.trim();
    }
}