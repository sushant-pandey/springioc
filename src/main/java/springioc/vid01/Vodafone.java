package springioc.vid01;

public class Vodafone implements Sim{

	public void calling() {
		System.out.println("Calling with Vodafone Sim");		
	}

	public void data() {
		System.out.println("Browsing data using Vodafone Sim");		
	}

}
