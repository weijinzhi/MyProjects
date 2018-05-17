package com.zstu.bean;

import java.util.Date;

public class Messages {
    private Integer id;

    private String messTitle;

    private String messContent;

    private String messType;

    private Integer teacherId;

    private Date createTime;

    private Teacher teacher;
    
    
    public Messages() {
		super();
	}

	public Messages(String messTitle, String messContent, String messType,
			Integer teacherId, Date createTime) {
		super();
		this.messTitle = messTitle;
		this.messContent = messContent;
		this.messType = messType;
		this.teacherId = teacherId;
		this.createTime = createTime;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessTitle() {
        return messTitle;
    }

    public void setMessTitle(String messTitle) {
        this.messTitle = messTitle == null ? null : messTitle.trim();
    }

    public String getMessContent() {
        return messContent;
    }

    public void setMessContent(String messContent) {
        this.messContent = messContent == null ? null : messContent.trim();
    }

    public String getMessType() {
        return messType;
    }

    public void setMessType(String messType) {
        this.messType = messType == null ? null : messType.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}