package day_3;

import java.util.Scanner;


public class GCD {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter n1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter n2: ");
		int n2 = sc.nextInt();
		
		//store original values coz value is exchange bellow.
		int a  = n1; 
		int b  = n2;
		
		while(a%b!=0) {    
			int rem = a%b; 
			a = b;          
			b = rem;
		}
		System.out.println("GCD is: "+b); 
		System.out.println("LCM is: "+(n1*n2)/b); 
		
	}

}
