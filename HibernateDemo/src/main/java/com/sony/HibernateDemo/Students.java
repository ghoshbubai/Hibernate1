package com.sony.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_dtl")
public class Students {

	@Id
	private int sid;
	private StudentName sname;
	private double marks;
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public StudentName getSname() {
		return sname;
	}

	public void setSname(StudentName sname) {
		this.sname = sname;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	
	
}
