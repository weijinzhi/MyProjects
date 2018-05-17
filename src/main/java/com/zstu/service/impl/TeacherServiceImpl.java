package com.zstu.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zstu.bean.Teacher;
import com.zstu.canstants.Canstants;
import com.zstu.dao.TeacherMapper;
import com.zstu.service.TeacherService;
import com.zstu.utils.BeanUtil;
import com.zstu.utils.PagedResult;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
	
	@Resource
	private TeacherMapper teacherMapper;
	
//	private static Logger logger = Logger.getLogger(TeacherServiceImpl.class); 

	@Override
	public String registerTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginTeacher(Teacher teacher,HttpSession httpSession) {
		if(null ==teacher.getTeacherId() || null==teacher.getPassword()){
			return Canstants.loginEmPawNull;
		}
		Teacher teacherEnty = teacherMapper.login(teacher);
		
		if(teacherEnty.getTeacherId().equals(teacher.getTeacherId()) && teacherEnty.getPassword().equals(teacher.getPassword())){
			httpSession.setAttribute("teacherId", teacherEnty.getTeacherId()); 
			httpSession.setAttribute("password", teacherEnty.getPassword());
			return Canstants.loginSuccess;
		}
		return Canstants.loginPawFail;
	}

	@Override
	public boolean activatEmail(Teacher teacher) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Teacher getById(String teacherId) {
		return teacherMapper.getById(teacherId);
	}
	
	@Override
	public Teacher selectTeacherById(Integer id) {
		return teacherMapper.selectTeacherById(id);
	}

	@Override
	public List<Teacher> selectTeacherByName(String teacherName) {
		List<Teacher> list = teacherMapper.selectTeacherByName(teacherName);
		return list;
	}

	@Override
	public PagedResult<Teacher> queryByPage(String teacherName, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(teacherMapper.selectTeacherByName(teacherName));
	}

	@Override
	public PagedResult<Teacher> queryByTeaId(String teacherId, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(teacherMapper.selectTeacherByTeaId(teacherId));
	}

	@Override
	public PagedResult<Teacher> queryByAcademy(String academy, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(teacherMapper.selectTeacherByAcademy(academy));
	}

	@Override
	public Teacher selectTeacherByTeaId(String teacherId) {
		return teacherMapper.getById(teacherId);
	}

	
		public Teacher getTeacherById(Integer id) {
			return teacherMapper.selectByPrimaryKey(id);
		}

		public void update(Teacher teacher) {
			teacherMapper.updateByPrimaryKeySelective(teacher);
		}
		

}

