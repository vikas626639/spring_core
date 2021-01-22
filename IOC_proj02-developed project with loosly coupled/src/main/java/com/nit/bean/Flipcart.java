package com.nit.bean;

import java.util.Arrays;
import java.util.Random;

import com.nit.Interface.Courier;

public class Flipcart {
	private Courier courier;
	//setter method

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	//business method
	public String purchesProduct(String...items) {
		//generate Random id
		Random ram=new Random();
		int orderid=ram.nextInt(1000000000);
		//use courier
		String status=courier.deliver(orderid);
		System.out.println();
		System.out.println(status+" purches items are="+Arrays.toString(items)+" and product orderid is="+orderid);
		return status;
		}
}
