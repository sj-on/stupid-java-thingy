package dummy;
import java.util.Scanner ;

public class MagicNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 9 == 1)
			System.out.println(n + " is a magic number.");
		else
			System.out.println(n + " isn't one.");
		sc.close();
	}
}
