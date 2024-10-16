package EPAM;

public class SecondLargestNumberInArray {
	
	public static int  findsecongLargest(int[] nums) {
		if(nums == null || nums.length < 2) {
			throw new IllegalArgumentException("Arry must contain atleast 2 elements");
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num: nums) {
			if(num > largest) {
				secondLargest = largest;
				largest = num;
			}else if(num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {1, 4, 6, 12, 8, 9, 23, 24};
		
		int result = findsecongLargest(numbers);
		System.out.println("SecondLargest number = "+result);
	}

}
