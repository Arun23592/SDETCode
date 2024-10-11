package CodingInterviewPrep;

public class LargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 6, 10, 7, 9 };
		int max = arr[0];
		for (int i : arr) {
			if (i > max)
				max = i;
		}
		System.out.println("Largest Element: " + max);
	}

}

//2. Find the Largest Element in an Array: Find and print the largest element in an array.

/*
 * 1. Initialize and Declare the array with input values. 2. Initialize Max
 * withFirst Element arr[0]. 3. Loop through the array - assign i : arr. 4 .
 * Compare i and max - if i > max then assign max = i. 5. print the largest
 * array
 */