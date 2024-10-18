package Cognizant;

public class ReverseEachWordWithoutReversing {
	
	
	public static String reverseString(String word) {
		char[] chars = word.toCharArray();
		int left = 0;
		int right = chars.length-1;
		
		while(left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		
		return new String(chars);
	}
	
	public static String reverseWord(String str) {
		String[] words = str.split(" ");
		String result = " ";
		
		for(String word : words) {
			String revWords = reverseString(word);
			result += revWords + " ";
		}
		
		return result.trim();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Try Coding";
		
		String revEachWord =	reverseWord(str);
		System.out.println("ReverseEachWordWithoutReversing: "+revEachWord);

	}

}
