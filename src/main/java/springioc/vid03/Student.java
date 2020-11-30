package springioc.vid03;

public class Student {
	private int id;		//integer dependency
	
	private String name;	//String dependency

	public void setId(int id) {		//setter for id
		this.id = id;
	}

	public void setName(String name) {		//setter for name
		this.name = name;
	}

	// method to display student information
	public void displayStudentInfo() {
		System.out.println("Student [id=" + id + ", name=" + name + "]");
	}
	
}
