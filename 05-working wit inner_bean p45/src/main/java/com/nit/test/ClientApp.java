package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.Student;

public class ClientApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		 BeanFactory bean=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml"));
		 Student st = bean.getBean("id", Student.class);
		 System.out.println(st);
	}
}
