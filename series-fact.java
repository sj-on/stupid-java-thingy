package dummy;
import java.util.Scanner;
import java.lang.Math;

public class Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n:\t");
		int n = sc.nextInt();
		float sum = 0.0f;
		for(int i=1; i<=n; i++) {
			sum += (i*Math.pow(-1, i+1))/factorial(Math.pow(2, i)) ;
		}
		System.out.println("The sum of the given series is: "+ sum);
		sc.close();
	}
	
	public static double factorial(double j) {
		if(j == 1)
			return 1;
		else
			return j*factorial(j-1);
	}
}
