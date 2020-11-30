package springioc.vid08.partI;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("We will study Mathematics.");
		
	}

	@Override
	public void teacherInfo() {
		System.out.println("Hi I am you Match Teacher.");
		
	}

}
