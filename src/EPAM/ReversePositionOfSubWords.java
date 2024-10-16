package EPAM;

public class ReversePositionOfSubWords {
	
	public static String capitilizeFirstLetter(String str) {
		if(str == null || str.isEmpty()) {
			return str;
		}
		
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		
	}
		public static String ReverseSubWords(String str) {
			
			String[] words = str.split(" ");
			
			StringBuilder reversedString = new StringBuilder();
			
			for(int i=words.length-1; i>=0; i--) {
				String capitalizeWords = capitilizeFirstLetter(words[i]);
				reversedString.append(capitalizeWords).append(" ");
			}
			
			
			return reversedString.toString().trim();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "India is great";
		String revWords = ReverseSubWords(input);
		System.out.println("Reversed Subwords: "+revWords);
		

	}

}
