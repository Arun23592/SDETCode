package Cognizant;

public class FindLargestWords {
	
	public static String largestWord(String s) {
		String[] words = s.split(" ");
		String result = "";
		
		for(String word: words) {
			if(word.length() > result.length()) {
				result = word;
			}
			
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome to Cognizant interview process";
		String str =	largestWord(s);
		System.out.println("Largest word: "+str);

	}

}
