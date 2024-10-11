package TopCodingJava;

import java.util.Arrays;

public class ReverseArray {

	public static void arrayReverse(int[] arr) {

		int start = 0, end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(inputArr));
		arrayReverse(inputArr);
		System.out.println(Arrays.toString(inputArr));

	}

}
