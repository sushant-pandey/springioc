package springioc.vid08.partC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part08CClient {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("college", College.class);
		college.test();
	}

}
