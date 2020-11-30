package springioc.vid06.partB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig/vid6_beans_partB.xml");
		System.out.println("Context Loaded");
		Human human = context.getBean("humanObj", Human.class);
		human.startPumping();
	}

}
