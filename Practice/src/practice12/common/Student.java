/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;
	String d;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;


	public void setID(int studentId){
		this.studentId = studentId;
	}
	public void setStuName(String studentName){
		this.studentName = studentName;
	}
	public void setCompName(String companyName){
		this.companyName = companyName;
	}
	public void setClassName(String className){
		this.className = className;
	}
	public void setMail(String mail){
		this.mail = mail;
	}
	public void setPass(String password){
		this.password = password;
	}


	public int getID(){
		return this.studentId ;
	}
	public String getStuName(){
		return this.studentName ;
	}
	public String getCompName(){
		return this.companyName;
	}
	public String getClassName(){
		return this.className;
	}
	public String getMail(){
		return this.mail;
	}
	public String getPass(){
		return this.password;
	}
}


