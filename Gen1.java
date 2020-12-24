package dummy;

public class Gen1 {
	void printer(Gen1 o1) {
		System.out.println("First Generation with object.");
	}
	void clue() {
		System.out.println("This is our first clue.");
	}
	
}

class Gen2 extends Gen1{
	void printer(Gen2 o2) {
		System.out.println("Second Generation with object.");
	}
	void clue() {
		System.out.println("This is our second clue.");
	}
}

