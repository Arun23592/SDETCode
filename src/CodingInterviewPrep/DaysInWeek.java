package CodingInterviewPrep;

public class DaysInWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String days = "thursday";
		
		switch(days.toLowerCase()) {
		case "saturday":
		case "sunday":
			System.out.println(days+ " is a Weekend");
			break;
			
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println(days+ " is a Weekdays");
			break;
			default:
				System.out.println("invalid days");
				break;
			
		}

	}

}
