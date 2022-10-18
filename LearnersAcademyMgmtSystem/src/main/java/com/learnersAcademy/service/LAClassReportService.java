package com.learnersAcademy.service;

import java.util.List;

import com.learnersAcademy.bean.LAClassReportBean;
import com.learnersAcademy.dao.LAClassReportDao;

public class LAClassReportService {

	public List<LAClassReportBean> generateClassReport() {
		return new LAClassReportDao().selectAllClassReportInfo();
	}
}
