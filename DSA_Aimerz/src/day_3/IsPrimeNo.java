package day_3;

import java.util.Scanner;

public class IsPrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to check prime: ");
		int n = sc.nextInt();
		int factors = 0, i;

		for (i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				factors++;
				if (n / i != i)
				factors++;
			}
			
		}
		if (factors > 2) {
			System.out.println("Not Prime!!!");
		} else {
			System.out.println("Prime!!");
		}

	}

}
