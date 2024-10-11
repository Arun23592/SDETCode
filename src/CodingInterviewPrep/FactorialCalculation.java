package CodingInterviewPrep;

public class FactorialCalculation {

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 5;
		System.out.println("Factorial number is: " + factorial(fact));

	}

}

//4. Factorial Calculation: Write a function to calculate the factorial of a number.