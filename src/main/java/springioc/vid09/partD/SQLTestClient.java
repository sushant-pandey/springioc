package springioc.vid09.partD;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
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
		ApplicationContext context =
				new ClassPathXmlApplicationContext("springconfig/Part09D.xml");
		CountryDAO sDao = context.getBean("countryDao", CountryDAO.class);
		sDao.selectAllRows();
		//Closing the application context
		// We need not close the application context in web-applications
		//Since this is a standalone application, we need to close the application context
		((ClassPathXmlApplicationContext)context).close();
	}

}
