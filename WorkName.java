package com.program.Employee;

import java.util.Date;

public class WorkName {

	private String Fname;
	private String Lname;
	private String Mname;
	private Long salary;
	private Date joinedOn;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Date getJoinedOn() {
		return joinedOn;
	}
	public void setJoinedOn(Date joinedOn) {
		this.joinedOn = joinedOn;
	}
	@Override
	public String toString() {
		return "WorkName [Fname=" + Fname + ", Lname=" + Lname + ", Mname=" + Mname + ", salary=" + salary
				+ ", joinedOn=" + joinedOn + "]";
	}
	
}