package com.learnersAcademy.bean;

/**
 * 
 * @author anildhaubhadel
 * Class bean
 */
public class LAClassBean {
	private String classId;
	private String className;
	
	public LAClassBean() {}
	
	public LAClassBean(String id, String className) {
		this.classId = id;
		this.className = className;
	}
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
