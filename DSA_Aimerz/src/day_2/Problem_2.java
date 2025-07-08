package day_2;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int sum = (n*(n+1))/2; //by using PMI @Math
		System.out.println("Sum of n natural number: "+sum);
		
	}

}
