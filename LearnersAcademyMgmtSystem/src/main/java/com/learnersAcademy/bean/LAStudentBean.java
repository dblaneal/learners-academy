package com.learnersAcademy.bean;

/**
 * 
 * @author anildhaubhadel
 * StudentBean
 */
public class LAStudentBean {
	
	private int studentId;
	private String studentRollNumber;
	private String studentName;
	private String address;
	private String DOB;
	private String phone;
	private String email;
	private String enrollmentDate;
	private String passoutDate;
	private String classId;
	private String subject;
	private String className;
	
	public LAStudentBean() {
		
	}
	
	public LAStudentBean(int studentId, 
			String studentRollNumber, 
			String studentName,  
			String address,
			String DOB,
			String phone,
			String email,
			String enrollmentDate,
			String passoutDate,
			String classId,
			String subject,
			String className){
		
		this.studentId = studentId;
		this.studentRollNumber = studentRollNumber;
		this.studentName = studentName;
		this.address = address;
		this.DOB = DOB;
		this.phone = phone;
		this.email = email;
		this.enrollmentDate =enrollmentDate;
		this.passoutDate = passoutDate;
		this.classId = classId;
		this.subject = subject;
		this.className = className;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getPassoutDate() {
		return passoutDate;
	}

	public void setPassoutDate(String passoutDate) {
		this.passoutDate = passoutDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
