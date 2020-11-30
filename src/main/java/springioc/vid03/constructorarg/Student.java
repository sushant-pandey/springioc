package springioc.vid03.constructorarg;

public class Student {
	private int id; // integer dependency

	private String name; // String dependency

	public Student(int id) {
		this.id = id;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// method to display student information
	public void displayStudentInfo() {
		System.out.println("Student [id=" + id + ", name=" + name + "]");
	}

}
