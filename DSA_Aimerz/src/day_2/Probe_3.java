package day_2;
import java.util.Scanner;

public class Probe_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int fact = 1;
		
		for(int i = n ; i <= n; i--) fact*=i;
		System.out.println("Factorial of "+n+" is "+fact);

	}

}
