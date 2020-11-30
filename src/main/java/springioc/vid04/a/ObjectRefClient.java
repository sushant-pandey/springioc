package springioc.vid04.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectRefClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig/vid4_beans_a.xml");
		System.out.println("Bean loaded");
		
		Student student = context.getBean("student1", Student.class);
		student.startCheating();
		
		AnotherStudent student2 = context.getBean("student2", AnotherStudent.class);
		student2.startCheating();
	}

}
