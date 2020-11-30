package springioc.vid07.partE;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;

	@Override
	public String toString() {
		return "Student [name=" + name 
				+ ", interestedCourse=" + interestedCourse 
				+ ", hobby=" + hobby + "]";
	}

}
