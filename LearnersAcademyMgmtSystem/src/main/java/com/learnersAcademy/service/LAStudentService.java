package com.learnersAcademy.service;

import java.util.List;

import com.learnersAcademy.bean.LAStudentBean;
import com.learnersAcademy.dao.LAStudentDao;

public class LAStudentService {

	public List<LAStudentBean> listAllStudent() {
		return new LAStudentDao().selectAllStudent();
	}

	public int insertStudent(LAStudentBean bean) {
		
		return new LAStudentDao().insertStudent(bean);
	}
	
	public boolean updateStudent(LAStudentBean bean) {
		return new LAStudentDao().updateStudent(bean);
	}
	
	public boolean deleteStudent(int id) {
		return new LAStudentDao().deleteStudent(id);
	}

	public LAStudentBean selectStudentById(int id) {
		return new LAStudentDao().selectStudentById(id);
	}
}


