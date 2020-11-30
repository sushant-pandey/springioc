package springioc.vid08.partM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	private String collegeName;

	private Principal principal;

	private Teacher teacher;

	@Autowired
	public College(@Value("${college.name}") String collegeName, Principal principal,
			@Qualifier("mathTeacher") Teacher teacher) {
		super();
		this.collegeName = collegeName;
		this.principal = principal;
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
