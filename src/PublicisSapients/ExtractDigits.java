package PublicisSapients;

public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hydera43450bad";
		
		StringBuilder digits = new StringBuilder();
		
		for(char ch: s.toCharArray()) {
			if(Character.isDigit(ch)) {
				digits.append(ch);
			}
		}
		
		System.out.println("Extracted digits: "+digits);
		
	}

}
