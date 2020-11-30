package springioc.vid03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		//Creating the application context and reading the config file
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig/vid3_beans.xml");
		
		System.out.println("Context loaded");
		//Object of first bean student1
		Student student1Obj = context.getBean("student1", Student.class);
		student1Obj.displayStudentInfo();
		
		//Object of first bean student2
		Student student2Obj = context.getBean("student2", Student.class);
		student2Obj.displayStudentInfo();
	}

}
