package com.zstu.bean;

public class Teacher {
    private Integer id;

    private String teacherId;

    private String teacherName;

    private String password;

    private String phone;

    private String sex;

    private String academy;
    
    public Teacher() {
		super();
	}

	public Teacher(Integer id, String teacherId, String teacherName,
			String password, String phone, String sex, String academy) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.password = password;
		this.phone = phone;
		this.sex = sex;
		this.academy = academy;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherId=" + teacherId
				+ ", teacherName=" + teacherName + ", password=" + password
				+ ", phone=" + phone + ", sex=" + sex + ", academy=" + academy
				+ "]";
	}
    
}