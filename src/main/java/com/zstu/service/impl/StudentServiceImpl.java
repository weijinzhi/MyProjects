package com.zstu.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zstu.bean.Student;
import com.zstu.canstants.Canstants;
import com.zstu.dao.StudentMapper;
import com.zstu.service.StudentService;
import com.zstu.utils.BeanUtil;
import com.zstu.utils.PagedResult;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Resource
	StudentMapper studentMapper;

	@Override
	public String registerStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginStudent(Student student, HttpSession httpSession) {
		if(null ==student.getStudentId() || null==student.getPassword()){
			return Canstants.loginEmPawNull;
		}
		Student studentEnty = studentMapper.login(student);
		if(studentEnty.getStudentId().equals(studentEnty.getStudentId()) && studentEnty.getPassword().equals(student.getPassword())){
			httpSession.setAttribute("studentId", studentEnty.getStudentId()); 
			httpSession.setAttribute("password", studentEnty.getPassword());
			return Canstants.loginSuccess;
		}		
		return Canstants.loginPawFail;
	}

	@Override
	public boolean activatEmail(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student selectStudentById(Integer id) {
		return studentMapper.selectStudentById(id);
	}

	@Override
	public List<Student> selectStudentByName(String studentName) {
		List<Student> list = studentMapper.selectStudentByName(studentName);
		return list;
	}

	@Override
	public PagedResult<Student> queryByPage(String studentName, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(studentMapper.selectStudentByName(studentName));
	}

	@Override
	public PagedResult<Student> queryByStuId(String studentId, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(studentMapper.selectStudentByStuId(studentId));
	}

	@Override
	public PagedResult<Student> queryByClassNum(String classNum,
			Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(studentMapper.selectStudentByClassNum(classNum));
	}

	@Override
	public PagedResult<Student> queryByAcademy(String academy, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(studentMapper.selectStudentByAcademy(academy));
	}
	
	//==================================================================
	@Override
	public Student selectStuByStuId(String studentId) {
		// TODO Auto-generated method stub
		
		return studentMapper.selectStuByStuId(studentId);
	}
	public void updateStu(Student student){
		studentMapper.updateByPrimaryKeySelective(student);
		}
	//====================================================================
	
	@Override
	public List<Student> getAll(){
		return	studentMapper.selectByExample(null); 

	};
}
