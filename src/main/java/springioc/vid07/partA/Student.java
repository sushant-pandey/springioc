package springioc.vid07.partA;

public class Student {
	private String name;
	private String interestedCourse;
	private String hobby;

	public void setName(String name) {
		this.name = name;
	}

	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

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
