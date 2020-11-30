package springioc.vid08.partL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.name}")
	private String collegeName;

	@Autowired
	private Principal principal;

	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;

	public void displayCollegeInfo() {
		// display simple college info
		System.out.println("College component created");
		
		System.out.println("College Name : " + collegeName);

		// call principal class methods
		principal.displayPrincipalInfo();

		// call teacher class methods
		teacher.teacherInfo();
		teacher.teach();
	}
}
