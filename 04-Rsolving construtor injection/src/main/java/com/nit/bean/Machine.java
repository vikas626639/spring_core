package com.nit.bean;

public class Machine {
	private Integer sid;
	private String sname,subject;
	public Machine(Integer sid, String sname, String subject) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Machine [sid=" + sid + ", sname=" + sname + ", subject=" + subject + "]";
	}
}
