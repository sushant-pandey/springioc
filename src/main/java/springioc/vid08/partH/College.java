package springioc.vid08.partH;

import org.springframework.stereotype.Component;

public class College {

	private Principal principal;

	private Teacher teacher;

	// Setter for the principal object
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	// Setter for the teacher object
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void displayCollegeInfo() {
		// display simple college info
		System.out.println("College component created");

		// call principal class methods
		principal.displayPrincipalInfo();

		// call teacher class methods
		teacher.teacherInfo();
		teacher.teach();
	}
}
