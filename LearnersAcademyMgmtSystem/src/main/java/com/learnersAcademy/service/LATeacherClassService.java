package com.learnersAcademy.service;

import java.util.List;

import com.learnersAcademy.bean.LATeacherClassBean;
import com.learnersAcademy.dao.LATeacherClassDao;

public class LATeacherClassService {

	public boolean insertTeacherClassBatch(List<LATeacherClassBean> bean) {

		return new LATeacherClassDao().insertTeacherClassBatch(bean);
	}
	
	public List<LATeacherClassBean> selectAllTeacherClassByID(int id) {
		return new LATeacherClassDao().selectAllTeacherClassByID(id);
	}
	
	public boolean deleteTeacherClass(int id) {
		return new LATeacherClassDao().deleteTeacherClass(id);
	}
	
	public boolean updateTeacherClass(List<LATeacherClassBean> listBean) {
		
		LATeacherClassDao dao = new LATeacherClassDao();
		
		// first performs deletion operation 
		dao.deleteTeacherClass(listBean.get(0).getTeacherId());
		
		// second performs insert operation
		return dao.insertTeacherClassBatch(listBean);
	}
}
