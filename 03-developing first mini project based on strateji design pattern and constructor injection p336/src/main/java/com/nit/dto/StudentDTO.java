package com.nit.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer sno;
	private String sname;
	private Integer m1,m2,m3;
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getM1() {
		return m1;
	}
	public void setM1(Integer m1) {
		this.m1 = m1;
	}
	public Integer getM2() {
		return m2;
	}
	public void setM2(Integer m2) {
		this.m2 = m2;
	}
	public Integer getM3() {
		return m3;
	}
	public void setM3(Integer m3) {
		this.m3 = m3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", sname=" + sname + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
}
