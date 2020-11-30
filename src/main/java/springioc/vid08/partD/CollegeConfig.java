package springioc.vid08.partD;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springioc.vid08.partC")
public class CollegeConfig {
	
	@Bean
	public College collegeBean() { //Name of the method will be the name of the bean
		College college = new College();
		return college;
	}
}
