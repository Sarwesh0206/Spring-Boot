package com.csc.ptu_college;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
 
 @Component
public class EIStudent {
	
	private int sid;
	private String sname;
	private String city;
	
	public EIStudent() {
		System.out.println("EI Object");
	}
	
	@Autowired //which is nothing but injecting one class with other class with autowired annotation 
	@Lazy
	
	
	ITStudent itstudent;
	
	public void show() {
		itstudent.show();
		System.out.print("E&I student has been called");
	}
	public int getSid() {
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	@Override
	public String toString() {
		return "EIStudent [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
	}
   
}
