package day_3;

import java.util.Scanner;

public class PrintFibonacciNo {
	
	public static void Fibonacci(int n) {
	int first = 0, second  = 1,  third;
	System.out.print(first +" "+second);
	for(int i = 1; i <= n; i++) {
		third = first + second;
		System.out.print(" "+ third);
		first = second;
		second = third;	
	 }

}
	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		Fibonacci(n);	
	}

}
