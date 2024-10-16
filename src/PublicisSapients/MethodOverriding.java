package PublicisSapients;

public class MethodOverriding {
	
	static class Manual{
		
		public void testing() {
			System.out.println("Functional testing has to be done");
		}
	}
	
	static	class Automation extends Manual{
		
		@Override
		public void testing() {
			System.out.println("Automation testing");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Manual manual = new Manual();
		Manual auto = new Automation();
		
//		manual.testing();
		auto.testing();

	}

}
