package dummy;

public class Child extends Human implements Brother, Sister{
	public void whatISay() {
		System.out.println("I say Mommy and nothing else. Because I am a baby\nShark do do do do do.");
	}
	public void whoAmI() {
		System.out.println("I am a small baby who does know how to talk. But. I do know how to type on a computer.");
	}
	
	public static void main(String[] args) {
		Child dino = new Child();
		dino.whoAmI();
		dino.whatISay();
		
		Human pika = new Child(); //is this downcasting??
		pika.whatISay();
		
		Human tika = new Human();
		tika.whatISay();
		
//		Child rika = new Human(); //cannot convert from human to child
//		rika.whatISay();
		
//		Child sika;
//		sika = tika; //cannot convert from human to child
		
//		Human bika;
//		bika.whatISay(); // bika may not have initialised
		
		Human cika;
		cika = pika;
		cika.whatISay();
	}
	
}

//two different interfaces, each having
//the same set of methods to be defined,
//when implemented by a class,
//do not cause an error because they could be
////defined anyway.
//the same won't be the case with two different classes
//therefore that will certainly throw an error
