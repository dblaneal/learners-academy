package com.learnersAcademy.bean;

/**
 * 
 * @author anildhaubhadel
 * TeacherBean
 */
public class LATeacherBean {
	private int teacherId;
	private String teacherName;
	private String address;
	private String DOB;
	private String email;
	private String phone;

	
	public LATeacherBean() {}
	
	public LATeacherBean(int id, String name, String address, String dob, String email, String phone) {
		this.teacherId = id;
		this.teacherName = name;
		this.address = address;
		this.DOB = dob;
		this.email = email;
		this.phone = phone;
	}
	
	public LATeacherBean(String name, String address, String dob, String email, String phone) {
		this.teacherName = name;
		this.address = address;
		this.DOB = dob;
		this.email = email;
		this.phone = phone;
	}
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
