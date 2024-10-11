package CodingInterviewPrep;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;

		for (int i = 0; i <= 10; i++) {
//			if (i == 1) {
//				continue; // Skip the iteration when i is 1
//			}
			System.out.println(n + "* " + i + " = " + n * i);
		}

	}

}

//Write a Java program to print Multiplication table
//2*1 = 2
//2*2 = 4
//.
//.
//.
//2*10 = 20

//Here only 2 * 1 = 2 should not be displayed.