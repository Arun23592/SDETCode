package CodingInterviewPrep;

public class PalindromeCheck {

	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left++) != str.charAt(right--))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "madama";
		System.out.println("This is Palindrome: " + isPalindrome(inputString));

	}

}

//3. Check for Palindrome: Determine if a given string is a palindrome.

/*
 * 1. Create a method to check isPalindrom:- public static boolean
 * isPalindrome(String str). 2. Initialize Two Pointers - left, right. 3. While
 * Loop to compare Characters- left < right 4. Character comparison:
 * str.charAt(left++) != str.charAt(right--) 5. Return true if all characters
 * are match else false
 */