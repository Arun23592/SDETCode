package PublicisSapients;

public class SwapPairOfCharacters {
	
	
	public static String swapPairs(String str) {
		if(str == null || str.length() < 2) {
			return str;
		}
		
		char[] charArray = str.toCharArray(); //convert string into char array
		for(int i=0; i<charArray.length-1; i+=2){
			char temp = charArray[i];
			charArray[i] = charArray[i+1];
			charArray[i+1] = temp;
			
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Mumbai";
		String s2 = "Hyderabad";
		
		System.out.println(swapPairs(s1));
		System.out.println(swapPairs(s2));
		

	}

}
