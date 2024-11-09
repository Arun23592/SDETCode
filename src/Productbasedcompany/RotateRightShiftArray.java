package Productbasedcompany;

public class RotateRightShiftArray {
	
	public static void reverseArray(int arr[], int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void rotateRight(int arr[], int n) {
		int length = arr.length;
		
		n = n % length;
		if(n == 0) return;
		
		reverseArray(arr, 0, length-1);
		reverseArray(arr, 0, n-1);
		reverseArray(arr, n, length-1);
		
		
	}
	
	public static void printArray(int[] arr) {
		for(int num: arr) {
			System.out.println(num +  " ");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int n = 3;
		
		System.out.println("Original Array: ");
		printArray(arr);
		
		rotateRight(arr, n);
		
		System.out.println("Array after right rotation: ");
		printArray(arr);

	}

}
