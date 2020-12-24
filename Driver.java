package dummy;

public class Driver extends Gen2 {
	public static void main(String[] args) {
		Gen1 g1 = new Gen1();
		Gen2 g2 = new Gen2();
		Driver g3 = new Driver();
		
		g3.printer(g1);
		g3.printer(g2);
		g3.clue();
	}
}
