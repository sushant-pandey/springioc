package springioc.vid06.partG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;

	@Autowired
	@Qualifier("octopusObj")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			System.out.println("Heart is pumping.");
			System.out.println("You are Alive!");
			System.out.println(heart);
		} else {
			System.out.println("You are dead!");
		}
	}
}
