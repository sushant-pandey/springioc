package springioc.vid05.partA;

public class Student {

	private Cheat cheat;
	
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheat() {
		cheat.cheat();
	}

}
