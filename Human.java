package dummy;

public class Human implements Mother {
	public static void main(String[] args) {
		//Sister s = new Sister(); //errror
		Human eurus = new Human();
		eurus.whatISay();
		eurus.whoAmI();
		eurus.goToOffice();
		eurus.whoIsMother();
	}
	
	public void whatISay() {
		System.out.println("I am the sister of my brother(s). That's trivial.");
	}
	public void whoAmI() {
		System.out.println("I am the only daughter of my parents.");
	}
	
	public void whoIsMother() {
		System.out.println("Mycroft Holmes. Because in Buckingham Palace he states that he'll be mother.");
	}
	public void goToOffice() {
			System.out.println("I go to office everyday. Batman smells, all the day, that is what I can saayyy.");
	}
	
}
