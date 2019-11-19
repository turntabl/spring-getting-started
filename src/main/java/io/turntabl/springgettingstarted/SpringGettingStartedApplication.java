package io.turntabl.springgettingstarted;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGettingStartedApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

		HumanBean person = (HumanBean)ac.getBean("identity");
		//HumanBean bestie = (HumanBean)ac.getBean("bf");

		System.out.println(person.fname);
		System.out.println(person.lname);
		System.out.println(person.bestFriend.fname);
//		System.out.println(bestie.bestFriend.lastName);
	}

}
