package springioc.vid08.partE;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springioc.vid08.partC")
public class CollegeConfig {
	
	@Bean(name="colBean1") //	Name provided will be the name of the bean
	public College collegeBean() { 
		College college = new College();
		return college;
	}
}
