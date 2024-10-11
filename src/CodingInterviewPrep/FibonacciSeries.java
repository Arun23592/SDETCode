package CodingInterviewPrep;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int a = 0, b = 1;
		System.out.print("Fibonacci series " + a + " " + b);

		for (int i = 2; i < n; i++) {
			int c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}

	}

}

//1. Variable initialization int n=10, a=0, b=1;			
/*
 * n= 10 number of terms in Fibonacci series to be generated. a=0, b=1; These
 * variables represents first two numbers of fibonaci series.
 */

//2. For loop to generate fibonacci series
//3. Calculation of next term int c = a + b;
//4. updating value for next iteration 