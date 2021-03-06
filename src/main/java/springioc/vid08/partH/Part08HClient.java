package springioc.vid08.partH;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part08HClient {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("colBean2", College.class);
		college.displayCollegeInfo();
	}

}
