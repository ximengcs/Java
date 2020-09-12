package com.simon.model;

/**
 * 学生类
 * 
 * @author SIMON
 *
 */
public class Student {

	private String id;
	private String name;
	private String age;
	private String sex;
	private String dept;
	private String tel;

	public Student(String id, String name, String age, String sex, String dept, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.dept = dept;
		this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
