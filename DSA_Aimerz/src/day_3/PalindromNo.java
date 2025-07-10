package day_3;

import java.util.Scanner;

public class PalindromNo {

	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int origiNo = no; 
		
		int revNo = 0;
		
		while (no != 0) {
			int rem = no % 10; // find the 1st digit
			revNo = revNo * 10 + rem; //  get digit one by one.
			no = no / 10; // keep the number divide i.e quotient	
		}
		
		System.out.println("Revered Number is: "+revNo);
		
		if(origiNo == revNo) {
			System.out.println("It's a Pailndrom Number!!");
		}else 
			System.out.println("It is not a Pailndrom Number!!");
	}

}
