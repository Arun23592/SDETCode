package CodingInterviewPrep;

import java.util.Scanner;

public class HCFCalculation {
	
	public static int HCF(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of HCF: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int hcf = HCF(num1, num2);
		System.out.println("HCF of "+ num1 + "and " + num2 + "	=" +hcf);
	}

}
