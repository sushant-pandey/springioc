package springioc.vid04.a;

public class Student {

	private int id;
	private MathCheating mathCheat;

	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheating mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void startCheating() {
		System.out.println("ID : " + id);
		mathCheat.cheating();
	}

}
