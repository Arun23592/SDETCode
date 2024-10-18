package Cognizant;

import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;

public class findOccuranceOfCharacters {
	
	public static Map<Character, Integer> countOccurance(String str) {
		// Create a HashMap to store the character counts
		Map<Character, Integer> countMap = new HashMap<>();
		
		  // Convert the string to a character array
		char[] chars = str.toCharArray();
		
		// Iterate through the character array
		for(char ch: chars) {
			//ignore space (optionaL)
			if(ch == ' ') {
				continue;
			}
			
			// Check if the character is already in the map
			if(countMap.containsKey(ch)) {
				// Increment the count if the character is already in the map
				countMap.put(ch, countMap.get(ch) + 1);
			}else {
				// Add the character to the map with a count of 1
				countMap.put(ch, 1);
			}
		}
		
		return countMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Try Programming";
		
		// Call the method to count character occurrences
		Map<Character, Integer> charCount =	countOccurance(str);
		
		// Print the character counts
		for(Map.Entry<Character, Integer> entry: charCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		

	}

}
