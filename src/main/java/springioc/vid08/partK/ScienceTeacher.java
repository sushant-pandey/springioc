package springioc.vid08.partK;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("We will study Science.");
		
	}

	@Override
	public void teacherInfo() {
		System.out.println("Hi I am you Science Teacher.");
		
	}

}
