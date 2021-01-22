package com.nit.CourierImpl;

import com.nit.Interface.Courier;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int orderid) {
		return "BlueDart is ready to deliver your order";
	}

}
