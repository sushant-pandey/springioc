package springioc.vid06.partE;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;

	@Autowired
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
