package com.learnersAcademy.service;

import com.learnersAcademy.dao.LATeacherDao;

import java.util.List;

import com.learnersAcademy.bean.*;

public class LATeacherService {
	
	public List<LATeacherBean> selectAllTeacher(){
		return new LATeacherDao().selectAllTeacher();
	}
	
	public LATeacherBean selectTeacherById(int id) {
		return new LATeacherDao().selectTeacherById(id);
	}
	
	public int insertTeacher(LATeacherBean bean) {
		return new LATeacherDao().insertTeacher(bean);
	}
	
	public boolean updateTeacher(LATeacherBean bean) {
		return new LATeacherDao().updateTeacher(bean);
	}
	
	public boolean deleteTeacher(int id) {
		return new LATeacherDao().deleteTeacher(id);
	}
}

