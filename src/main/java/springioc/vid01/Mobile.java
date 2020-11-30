package springioc.vid01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig/beans.xml");
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}

}
