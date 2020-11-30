package springioc.vid07.partD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig/vid7_partD.xml");
		System.out.println("Context Loaded");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}

}
