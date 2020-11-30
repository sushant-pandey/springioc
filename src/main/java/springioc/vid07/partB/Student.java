package springioc.vid07.partB;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String interestedCourse;
	private String hobby;

	@Value("Sushant")
	public void setName(String name) {
		this.name = name;
	}

	@Value("Java")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	@Value("Movies")
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
