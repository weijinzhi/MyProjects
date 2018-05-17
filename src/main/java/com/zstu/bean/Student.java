package com.zstu.bean;

public class Student {
    private Integer id;

    private String studentId;

    private String studentName;

    private String password;

    private String sex;

    private String classnum;

    private String academy;
    
    public Student(Integer id, String studentId, String studentName,
			String password, String sex, String classnum, String academy) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.studentName = studentName;
		this.password = password;
		this.sex = sex;
		this.classnum = classnum;
		this.academy = academy;
	}
    
    public Student() {
		super();
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum == null ? null : classnum.trim();
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }
}