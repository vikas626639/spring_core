package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.bean.Faculty;
import com.nit.bean.Markes;
import com.nit.bean.Student;

public class ClientTest {
	public static void main(String[] args) {
		//bootstrap the ioc container
		BeanFactory bean = new XmlBeanFactory(new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml"));
		//Markes bean2 = bean.getBean("markes",Markes.class);
		//Student bean2 = bean.getBean("student",Student.class);
		Faculty bean2 = bean.getBean("ft",Faculty.class);
		System.out.println(bean2);
	}
}
