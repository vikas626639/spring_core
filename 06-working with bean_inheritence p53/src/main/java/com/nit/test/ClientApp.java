package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.bean.Bike;

public class ClientApp {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext2.xml"));
		Bike bean = factory.getBean("pulsor1",Bike.class);
		System.out.println(bean);
		}
}
