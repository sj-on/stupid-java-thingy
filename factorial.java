package dummy;
import java.util.Scanner ;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n:\t");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++)
		{
			sum += fact(i);
			System.out.println(i+"! + ");
		}
		System.out.println("="+ sum);
		sc.close();
	}
	
	public static int fact(int j) {
		if(j == 1)
			return 1;
		else
			return j*fact(j-1);
	}

}
