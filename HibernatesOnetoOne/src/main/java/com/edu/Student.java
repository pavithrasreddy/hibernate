package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hibstudent")
public class Student {
	@Id
	private int sid;
	private String sname;

 int smarks;
 @OneToOne
 Laptop lp;
 
 public Laptop getLp() {
	return lp;
}
public void setLp(Laptop lp) {
	this.lp = lp;
}
int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", lp=" + lp + "]";
	}
	
	
	
		

	

}
