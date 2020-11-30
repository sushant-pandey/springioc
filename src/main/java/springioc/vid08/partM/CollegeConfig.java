package springioc.vid08.partM;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "springioc.vid08.partM")
@PropertySource("classpath:properties/vid8.properties")
public class CollegeConfig {
	
}
