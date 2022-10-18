package com.learnersAcademy.service;

import java.util.List;

import com.learnersAcademy.bean.LAClassBean;
import com.learnersAcademy.dao.LAClassDao;


public class LAClassService {
	
	public List<LAClassBean> listAllClass() {
		return new LAClassDao().selectAllClass();
	}
	
	public int insertClass(LAClassBean bean) {
		
		return new LAClassDao().insertClass(bean);
	}
	
	public boolean updateClass(LAClassBean bean) {
		return new LAClassDao().updateClass(bean);
	}
	
	public boolean deleteClass(String id) {
		return new LAClassDao().deleteClass(id);
	}

	public LAClassBean selecClassById(String id) {
		return new LAClassDao().selectClassById(id);
	}
}
