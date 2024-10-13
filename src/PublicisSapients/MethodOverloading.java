package PublicisSapients;

public class MethodOverloading {
	
	public static int addNumbers(int a, int b) {
		return a+b;
	}
	
	public static double addNumbers(double a, double b) {
		return a+b;
	}
	
	public static int addNumbers(int a, int b,  int c) {
		return a+b+c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result1 = addNumbers(3, 2);
		double result2 = addNumbers(3.1, 2.5);
		int result3 = addNumbers(3, 2, 6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
