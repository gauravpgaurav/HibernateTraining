package com.training.apps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.HiberSpringExample;
import com.training.entity.Doctor2016;

public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

		HiberSpringExample dao = ctx.getBean(HiberSpringExample.class);

		Doctor2016 doc = new Doctor2016(401, "Watson", 8564585632L);

		Integer key = (Integer) dao.add(doc);
		System.out.println("One Doctor with key : " + key + " is added");

		ctx.close();

	}

}
