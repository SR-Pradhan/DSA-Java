package day_2;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a +ve Interger: ");
		int a = sc.nextInt();
		for(int i = 1; i<=a; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of "+a+" is: "+fact);
	}

}
