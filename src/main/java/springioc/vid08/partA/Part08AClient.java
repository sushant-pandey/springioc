package springioc.vid08.partA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part08AClient {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig/Part08A.xml");
		College college = context.getBean("collegeBean", College.class);
		System.out.println(college);
	}

}
