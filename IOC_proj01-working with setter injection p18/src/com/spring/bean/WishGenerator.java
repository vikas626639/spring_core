package com.spring.bean;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class WishGenerator {
	private String name;		//property 
	private Date date;			//this is a Date Predefine class property
	//setter and getter method
	private static Scanner sc=null;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	//business logic
	public String WishMsg() {
		String msg="";
		//calling calendar class object
		Calendar cal=Calendar.getInstance();
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		msg=(hour<=12)?"Good Morning":(hour<=15)?"Good After Noon":(hour<=18)?"Good evening":"Good Night";
		System.err.println(name+" "+msg+" today date is= "+date);
		return msg;	
	}
}
