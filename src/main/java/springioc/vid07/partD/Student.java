package springioc.vid07.partD;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String interestedCourse;
	private String hobby;

	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}


	@Value("${student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [name=" + name 
				+ ", interestedCourse=" + interestedCourse 
				+ ", hobby=" + hobby + "]";
	}

}
