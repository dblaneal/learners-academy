package com.learnersAcademy.dao;

public class LADaoConstants {
	
	//Table user
	final static String USER_TABLE = "[user]";
	
	//Column name
	final static String USERID_COLUMN = "USERID";
	final static String USER_NAME_COLUMN = "USER_NAME";
	final static String USER_PASSWORD_COLUMN = "PASSWORD";
	final static String ROLE_COLUMN = "ROLE";
	
	// These constants are related to queries
	final static String INSERT_USER_QUERY = "INSERT INTO"+ USER_TABLE +"VALUES(?,?,?,?)";
	final static String SELECT_USER_WHERE_ID_QUERY = "SELECT * FROM"+ USER_TABLE + "WHERE "+ USER_NAME_COLUMN +"=";
	final static String UPDATE_USER_QUERY = "";
	final static String DELETE_USER_QUERY = "DELETE	FROM"+USER_TABLE+ "WHERE" +USERID_COLUMN+"=";
	
	//Number constants
	final static int Number_0 = 0;
	final static int NUMBER_1 = 1;
	final static int NUMBER_2 = 2;
	final static int NUMBER_3 = 3;
	final static int NUMBER_4 = 4;
	final static int NUMBER_5 = 5;
	final static int NUMBER_6 = 6;
	final static int NUMBER_7 = 7;
	final static int NUMBER_8 = 8;
	final static int NUMBER_9 = 9;
	final static int NUMBER_10 = 10;
	final static int NUMBER_11 = 11;
	final static int NUMBER_12 = 12;
	
	
	//Table student
	final static String STUDENT_TABLE = "[student]";
	
	final static String S_ID_COLUMN = "STUDENT_ID";
	final static String S_ROLL_NUMBER_COLUMN = "ROLL_NUMBER";
	final static String S_NAME_COLUMN = "STUDENT_NAME";
	final static String S_ADDRESS_COLUMN = "ADDRESS";
	final static String S_DOB_COLUMN = "DOB";
	final static String S_PHONE_COLUMN = "PHONE";
	final static String S_EMAIL_COLUMN = "EMAIL";
	final static String S_ENROLLMENT_DATE_COLUMN = "ENROLLMENT_DATE";
	final static String S_PASSOUT_DATE_COLUMN = "PASSOUT_DATE";
	final static String S_CLASS_ID_COLUMN = "CLASS_ID";
	final static String S_SUBJECT_NAME_COLUMN = "SUBJECT_NAME";
	final static String S_CLASS_NAME_COLUMN = "CLASS_NAME";
	
	final static String SELECT_STUDENT_BY_ID_QUERY = "SELECT * FROM " + STUDENT_TABLE + "WHERE STUDENT_ID = ?" ;
	final static String SELECT_ALL_STUDENTS = "SELECT * FROM " + STUDENT_TABLE;
	final static String INSERT_STUDENT_QUERY = "INSERT INTO" + STUDENT_TABLE + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	final static String UPDATE_STUDENT_QUERY = "UPDATE " + STUDENT_TABLE +  "SET"
			+" ROLL_NUMBER = ?, STUDENT_NAME = ?,ADDRESS= ?, DOB =?, PHONE= ?,EMAIL= ?,CLASS_ID= ?, ENROLLMENT_DATE= ?,PASSOUT_DATE= ?, SUBJECT_NAME= ?, CLASS_NAME= ? where STUDENT_ID = ?;";
	
	final static String DELETE_STUDENT_QUERY = "DELETE FROM " +  STUDENT_TABLE + "where " + S_ID_COLUMN + "= ?";

	
	//Table teacher
	final static String TEACHER_TABLE = "[teacher]";
	
	final static String TEACHER_ID_COLUMN = "TEACHER_ID";
	final static String TEACHER_NAME_COLUMN = "TEACHER_NAME";
	final static String TEACHER_ADDRESS_COLUMN = "ADDRESS";
	final static String TEACHER_DOB_COLUMN = "DOB";
	final static String TEACHER_PHONE_COLUMN = "PHONE";
	final static String TEACHER_EMAIL_COLUMN = "EMAIL";
	final static String TEACHER_SALARY_COLUMN = "SALARY";
	final static String TEACHER_SUBJECT_ID_COLUMN = "SUBJECT_ID";
	
	final static String SELECT_TEACHER_BY_ID_QUERY = "SELECT * FROM " +TEACHER_TABLE+ " WHERE " + TEACHER_ID_COLUMN + " =?";
	final static String SELECT_ALL_TEACHER_QUERY = "SELECT * FROM " + TEACHER_TABLE;
	final static String INSERT_TEACHER_QUERY = "INSERT INTO " +TEACHER_TABLE+ " VALUES(?,?,?,?,?)";
	final static String UPDATE_TEACHER_QUERY = "UPDATE " +TEACHER_TABLE+ " SET" 
						+TEACHER_NAME_COLUMN + "=?, " 
						+TEACHER_ADDRESS_COLUMN+ "=?, " 
						+TEACHER_DOB_COLUMN+ "=?, "
						+TEACHER_PHONE_COLUMN+ "=?, "
						+TEACHER_EMAIL_COLUMN+ "=?";
	final static String DELETE_TEACHER_QUERY = "DELETE FROM " +TEACHER_TABLE+ " WHERE "+TEACHER_ID_COLUMN+ "=?";
	
	
	//Table class
	final static String CLASS_TABLE = "[class]";
	final static String CLASS_ID_COLUMN = "CLASS_ID";
	final static String CLASS_NAME_COLUMN = "CLASS_NAME";
	
	final static String SELECT_CLASS_BY_ID_QUERY = "SELECT * FROM " +CLASS_TABLE+ " WHERE " +CLASS_ID_COLUMN+" =?";
	final static String SELECT_ALL_CLASS_QUERY = "SELECT * FROM " + CLASS_TABLE;
	final static String INSERT_CLASS_QUERY = "INSERT INTO " +CLASS_TABLE+ " VALUES(?,?)";
	final static String UPDATE_CLASS_QUERY = "UPDATE " +CLASS_TABLE+ " SET " +CLASS_NAME_COLUMN+ "=? WHERE " +CLASS_ID_COLUMN+" =?";
	final static String DELETE_CLASS_QUERY = "DELETE FROM " +CLASS_TABLE+ " WHERE " +CLASS_ID_COLUMN+" =?";
	
	
	//Table subject
	final static String SUBJECT_TABLE = "[subject]";
	final static String SUBJECT_ID_COLUMN = "SUBJECT_ID";
	final static String SUBJECT_NAME_COLUMN = "SUBJECT_NAME";
	final static String SUBJECT_CLASS_ID_COLUMN = "CLASS_ID";
	
	final static String SELECT_ALL_SUBJECT_QUERY = "SELECT * FROM " +SUBJECT_TABLE;
	final static String SELECT_SUBJECT_BY_ID_QUERY = "SELECT * FROM " +SUBJECT_TABLE+ " WHERE " +SUBJECT_ID_COLUMN+" =?";
	final static String SELECT_SUBJECT_BY_CLASS_ID_QUERY = "SELECT * FROM " +SUBJECT_TABLE+ " WHERE " +SUBJECT_CLASS_ID_COLUMN+" =?";
	final static String INSERT_SUBJECT_QUERY = "INSERT INTO " +SUBJECT_TABLE+ " VALUES(?,?,?)";
	final static String UPDATE_SUBJECT_QUERY = "UPDATE " +SUBJECT_TABLE+ " SET " +SUBJECT_NAME_COLUMN+ "=?, " +SUBJECT_CLASS_ID_COLUMN+ "=? WHERE " +SUBJECT_ID_COLUMN+" =?";
	final static String DELETE_SUBJECT_QUERY = "DELETE FROM " +SUBJECT_TABLE+ " WHERE " +SUBJECT_ID_COLUMN+" =?";
	final static String SELECT_ALL_SUBJECT_CLASS_QUERY = "SELECT subject.SUBJECT_ID, subject.SUBJECT_NAME, class.CLASS_ID, class.CLASS_NAME "
			+ "from" + SUBJECT_TABLE +","+ CLASS_TABLE + " WHERE subject.CLASS_ID = class.CLASS_ID";
	
	
	//Table teacher_class
	final static String TEACHER_CLASS_TABLE = "[teacher_class]";
	final static String TEACHER_CLASS_ID_COLUMN = "TEACHER_ID";
	final static String TEACHER_CLASS_NAME = "CLASS_NAME";
	final static String TEACHER_CLASS_SUBJECT_NAME = "SUBJECT_NAME";
	
	final static String SELCECT_TEACHER_CALSS_BY_ID_QUERY = "SELECT * FROM " + TEACHER_CLASS_TABLE + " WHERE " + TEACHER_CLASS_ID_COLUMN + "=?";
	final static String INSERT_TEACHER_CLASS_QUERY = "INSERT INTO " +TEACHER_CLASS_TABLE+ " VALUES(?,?,?)";
	final static String UPDATE_TEACHER_CLASS_QUERY = "UPDATE " +TEACHER_CLASS_TABLE+ " SET " 
					+TEACHER_CLASS_ID_COLUMN+ "=?, " 
					+TEACHER_CLASS_NAME+"=?, " 
					+TEACHER_CLASS_SUBJECT_NAME+"=? WHERE "
					+TEACHER_CLASS_ID_COLUMN+" =?";
	final static String DELETE_TEACHER_CLASS_QUERY = "DELETE FROM " +TEACHER_CLASS_TABLE+ " WHERE " +TEACHER_CLASS_ID_COLUMN+" =?";
	
	
	//Report class QUERY
	final static String GET_REPORT_CLASS_QUERY = "SELECT X.STUDENT_ID, X.STUDENT_NAME, X.CLASS_ID, X.CLASS_NAME, X.SUBJECT_NAME , Y.TEACHER_ID, Z.TEACHER_NAME FROM student X INNER JOIN\n"
			+ "teacher_class Y ON X.CLASS_NAME = Y.CLASS_NAME AND X.SUBJECT_NAME = Y.SUBJECT_NAME INNER JOIN teacher Z on Y.TEACHER_ID = Z.TEACHER_ID";
			
			
	
}
