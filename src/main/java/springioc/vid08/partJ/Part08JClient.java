package springioc.vid08.partJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part08JClient {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("college", College.class);
		college.displayCollegeInfo();
	}

}
