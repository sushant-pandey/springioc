package springioc.vid08.partG;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springioc.vid08.partC")
public class CollegeConfig {
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean Teacher mathTeacherBean() {
		return new MathTeacher();
	}
	
	@Bean(name= {"colBean1", "colBean2"}) //	Name provided will be the name of the bean
	public College collegeBean() { 
		College college = new College(principalBean(), mathTeacherBean());
		return college;
	}
}
