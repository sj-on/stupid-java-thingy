package dummy;

public class Overriding {
	void print() {
		System.out.println("This method is being overriden.");
	}
	void normal() {
		System.out.println("This method won't be overriden.");
	}
	
	public static void main(String[] args) {
		Overrider ob = new Overrider();
		ob.paint();		//from derived class
		ob.normal();	//from base class
		ob.print();		//from derived class. Base class's print() will be overriden.
	}
}
class Overrider extends Overriding{
	void paint(){
		System.out.println("Paint a watercolor. My drink water's cold.");
	}
	
	@Override
	void print() {
		System.out.println("I am the overrider.");
	}
}
