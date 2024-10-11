package CodingInterviewPrep;

public class GarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int n = 10000;
		
		for(int i=0; i<n; i++) {
			String temp = new String("GArbage collector");
			System.out.println("GC: "+temp);
		}
		
//		Runtime.getRuntime().gc();
		System.gc();

	}

}
