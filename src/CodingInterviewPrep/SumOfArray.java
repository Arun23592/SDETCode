package CodingInterviewPrep;

public class SumOfArray {
	
	
	public static int sumArray(int[] arr) {
		
		int sum = 0;
		
		for(int num: arr) {
			sum += num;
		}
		
		return  sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1, 3, 5, 6};
		
		int sum = sumArray(arr);
		
		System.out.println("sum of an array: "+sum);
		
		

	}

}
