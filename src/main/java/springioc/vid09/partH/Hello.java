package springioc.vid09.partH;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method called");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method called");
		
	}
	
}
