package springioc.vid08.partG;

import org.springframework.stereotype.Component;

public class College {
	
	private Principal principal;
	
	private Teacher teacher;
	
	//Constructor for initializeing the college class
	public College(Principal principal, Teacher teacher) {
		this.principal = principal;
		this.teacher = teacher;
	}
	
	public void displayCollegeInfo() {
		//display simple college info
		System.out.println("College component created");
		
		//call principal class methods
		principal.displayPrincipalInfo();
		
		//call teacher class methods
		teacher.teacherInfo();
		teacher.teach();
	}
}
