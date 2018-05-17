package com.zstu.bean;

import java.util.Date;

public class Stu_Submit_To_Teacher {
    private Integer id;

    private Integer studentId;

    private Integer reportId;

    private Date submitTime;

    private String state;

    private String submitFileName;

    private String submitFilePath;
    
    private Student student;
    
    

    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSubmitFileName() {
        return submitFileName;
    }

    public void setSubmitFileName(String submitFileName) {
        this.submitFileName = submitFileName == null ? null : submitFileName.trim();
    }

    public String getSubmitFilePath() {
        return submitFilePath;
    }

    public void setSubmitFilePath(String submitFilePath) {
        this.submitFilePath = submitFilePath == null ? null : submitFilePath.trim();
    }
}