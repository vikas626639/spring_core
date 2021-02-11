package com.nit.beans;

import java.util.Arrays;
import java.util.List;

public class Student {
	private int msrks[];
	private List<String>name;
	
	public void setMsrks(int[] msrks) {
		this.msrks = msrks;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [msrks=" + Arrays.toString(msrks) + ", name=" + name + "]";
	}
}
