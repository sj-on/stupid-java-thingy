package dummy;

public class Overloading {
	public void print(char c) {
		System.out.println("The printed thing is a character: "+ c);
	}
	public void print(int i) {
		System.out.println("The printed thing is an integer: "+ i);
	}
	public void print(float f) {
		System.out.println("The printed thing is a floating point number: "+ f);
	}

	public static void main(String[] args) {
		Overloading printer = new Overloading();
		printer.print('C');		//character
		printer.print(22);		//integer
		printer.print('2');		//character
		printer.print(94.567f);		//floating point number
	}

}
