package day_2;
import java.util.Scanner;

public class Probem_1 {

	public static void main(String[] args) {
		System.out.print("Enter a Interger: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2 == 0) System.out.print("The Interger is EVEN");
		else System.out.print("The Interger is ODD");
				
	}

} 
