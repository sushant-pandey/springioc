package springioc.vid09.partG;

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
				new ClassPathXmlApplicationContext("springconfig/Part09G.xml");
		((ClassPathXmlApplicationContext)context).registerShutdownHook();
		CountryDAO sDao = context.getBean("countryDao", CountryDAO.class);
		sDao.selectAllRows();
		Hello hello = context.getBean("hello", Hello.class);
		HI hi = context.getBean("hi", HI.class);
	}

}
