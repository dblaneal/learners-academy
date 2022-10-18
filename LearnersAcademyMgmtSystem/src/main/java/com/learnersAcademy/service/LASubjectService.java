package com.learnersAcademy.service;

import java.util.List;

import com.learnersAcademy.bean.LAClassBean;
import com.learnersAcademy.bean.LASubjectBean;
import com.learnersAcademy.dao.LAClassDao;
import com.learnersAcademy.dao.LASubjectDao;

public class LASubjectService {

	public List<LASubjectBean> listAllSubjectByClassID(String id) {
		return new LASubjectDao().selectSubjectByClassId(id);
	}

	public List<LASubjectBean> listAllSubject(){
		return new LASubjectDao().selectAllSubject();
	}

	public List<LASubjectBean> listAllSubjectAndClass(){
		return new LASubjectDao().selectAllSubjectAndClass();
	}
	
	public int insertSubject(LASubjectBean bean) {

		return new LASubjectDao().insertSubject(bean);
	}
	

	public boolean updateSubject(LASubjectBean bean) {
		return new LASubjectDao().updateSubject(bean);
	}
	
	public boolean deleteSubject(String id) {
		return new LASubjectDao().deleteSubject(id);
	}
	
	public LASubjectBean selecSubjectById(String id) {
		return new LASubjectDao().selectSubjectById(id);
	}
	

}
