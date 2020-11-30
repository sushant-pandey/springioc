package springioc.vid09.partH;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SQLTestClient {
	
	/*
	 * General flow
	 * Bean creation
	 * Dependency Injection
	 * Init method called ( @PostCOnstruct
	 * work on the functionality
	 * Destroy method gets called ( @PreDestroy)
	 */
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("springconfig/Part09H.xml");
		((ClassPathXmlApplicationContext)context).registerShutdownHook();
		
		Hello hello = context.getBean("hello", Hello.class);
		
	}

}
