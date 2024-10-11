package CodingInterviewPrep;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal value");
		int decimal = sc.nextInt();
		
		String binary = Integer.toBinaryString(decimal);
		
		System.out.println("Converted decimal to Binary :" +binary);

	}

}
