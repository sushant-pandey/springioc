package springioc.vid08.partL;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "springioc.vid08.partL")
@PropertySource("classpath:properties/vid8.properties")
public class CollegeConfig {
	
}
