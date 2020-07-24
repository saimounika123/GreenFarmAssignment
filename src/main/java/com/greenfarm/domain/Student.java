package com.greenfarm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	@Column(name="stuName")
	private String stuName;
	@Column(name="age")
	private Integer age;
	@Column(name="gender")
	private String gender;
	@Column(name="study")
	private Integer study;
	@Column(name="percentage")
	private Integer percentage;
	
	public Student() {}
	
	public Student(String stuName, Integer age, String gender, Integer study, Integer percentage) {
		super();
		//this.id=id;
		this.stuName = stuName;
		this.age = age;
		this.gender = gender;
		this.study = study;
		this.percentage = percentage;
	}
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getStudy() {
		return study;
	}
	public void setStudy(Integer study) {
		this.study = study;
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	
}
