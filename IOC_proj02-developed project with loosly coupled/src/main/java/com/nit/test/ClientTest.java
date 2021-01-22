package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.bean.Flipcart;

public class ClientTest {
	public static void main(String[] args) {
		//configure the context file
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml"));
		Flipcart bean = factory.getBean("fcart",Flipcart.class);
		bean.purchesProduct("mobile","car","earfone");
	}

}
