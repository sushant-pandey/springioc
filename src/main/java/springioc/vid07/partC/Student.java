package springioc.vid07.partC;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String interestedCourse;
	private String hobby;

	@Required
	@Value("Sushant")
	public void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("deprecation")
	
//	@Value("Java")
	@Required
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

//	@Value("Movies")
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
