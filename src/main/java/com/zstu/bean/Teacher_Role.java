package com.zstu.bean;

public class Teacher_Role {
    private Integer id;

    private Integer roleId;

    private Integer teacherId;
    
    private Teacher teacher;
    
    private Role role;
    
    public Teacher_Role() {
		super();
	}
    
	public Teacher_Role(Integer id, Integer roleId, Integer teacherId) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.teacherId = teacherId;
	}



	public Teacher_Role(Integer id, Integer roleId, Integer teacherId,
			Teacher teacher, Role role) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.teacherId = teacherId;
		this.teacher = teacher;
		this.role = role;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Teacher_Role [id=" + id + ", roleId=" + roleId + ", teacherId="
				+ teacherId + ", teacher=" + teacher + ", role=" + role + "]";
	}
	
}