package com.nit.CourierImpl;

import com.nit.Interface.Courier;

public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("0 param constructor");
	}

	@Override
	public String deliver(int orderid) {
		return "DTDC ready to deliverd your order";
	}


}
