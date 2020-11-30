package springioc.vid05.partA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectRefClient {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig/vid5_beans_partA.xml");
		System.out.println("Bean loaded");

		Student student = context.getBean("student1", Student.class);
		student.cheat();
	}

}
