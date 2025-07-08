package day_3;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		String revStr = "";
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		for (int i = str.length()-1; i>=0; i--) {
			revStr += str.charAt(i);	
		}
		System.out.println("Reversed String is: "+revStr);	
		

	}

}
