package com.job.post;

public class JobEntity {
private int id;
private String jobName;
private String exprience;
private String location;
private String salary;
private String keySkill;
public JobEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public JobEntity(String jobName, String exprience, String location, String salary, String keySkill) {
	super();
	this.jobName = jobName;
	this.exprience = exprience;
	this.location = location;
	this.salary = salary;
	this.keySkill = keySkill;
}
@Override
public String toString() {
	return "JobEntity [id=" + id + ", jobName=" + jobName + ", exprience=" + exprience + ", location=" + location
			+ ", salary=" + salary + ", keySkill=" + keySkill + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getJobName() {
	return jobName;
}
public void setJobName(String jobName) {
	this.jobName = jobName;
}
public String getExprience() {
	return exprience;
}
public void setExprience(String exprience) {
	this.exprience = exprience;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getKeySkill() {
	return keySkill;
}
public void setKeySkill(String keySkill) {
	this.keySkill = keySkill;
}


}
