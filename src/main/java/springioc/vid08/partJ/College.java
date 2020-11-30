package springioc.vid08.partJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.name}")
	private String collegeName;

	private Principal principal;

	private Teacher teacher;

	// Setter for the principal object
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	// Setter for the teacher object
	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

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
