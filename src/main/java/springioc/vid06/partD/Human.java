package springioc.vid06.partD;

public class Human {
	private Heart heart;

	public Human(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			System.out.println("Heart is pumping.");
			System.out.println("You are Alive!");
		} else {
			System.out.println("You are dead!");
		}
	}
}
