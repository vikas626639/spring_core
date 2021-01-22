package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.bean.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		//locate spring bean configuration file
		FileSystemResource res=new FileSystemResource("src/com/spring/cfgs/applicationContecxt.xml");
		//Activate BeanFactory container
		XmlBeanFactory factory=new XmlBeanFactory(res);//old approach
		WishGenerator wms =factory.getBean("wish",WishGenerator.class);
		wms.WishMsg();
	}

}
