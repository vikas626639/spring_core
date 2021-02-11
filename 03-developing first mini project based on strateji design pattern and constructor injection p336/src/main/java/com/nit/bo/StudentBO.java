package com.nit.bo;

public class StudentBO {
	private Integer sno;
	private String sname;
	private Integer total;
	private float avg;
	private String result;

	//generate getter and setter method
	
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
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	//toString method
	@Override
	public String toString() {
		return "StudentBO [sno=" + sno + ", sname=" + sname + ", total=" + total + ", avg=" + avg + ", result=" + result
				+ "]";
	}
}

//bo class has property data to insert in dao class then dao insert into the table by using sql quries 
//so this is the final property for inserting the  record in db table
