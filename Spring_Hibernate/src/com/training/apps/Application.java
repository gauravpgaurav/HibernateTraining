package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.HiberSpringExample;
import com.training.entity.Doctor;

public class Application {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		HiberSpringExample dao=ctx.getBean(HiberSpringExample.class);
		
		Doctor doc=new Doctor(401, "Watson", 8564585632L);
		
		Integer key=(Integer)dao.add(doc);
		System.out.println("One Doctor with key : "+key +" is added");
				

	}

}
