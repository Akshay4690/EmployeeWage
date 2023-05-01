package bridge;

public class Uc4 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee");
		
		int perHour = 20;
		int fullDayHour = 8 ;
		int partTimeHour = 4 ;

		int empType = (int) (Math.random()*2);
		
		int empHours = 0 ;
		String empType1 = "" ;
		
		switch (empType)
		{
		case 0 :
			empHours = fullDayHour;
			empType1 = "Full - Time";
			break ;
		
		case 1 :
			empHours = partTimeHour;
			empType1 = "Part - Time" ;
			break;
			
		default:
			break;
		}
		
		int dailyWage = empHours * perHour;
		
		
		System.out.println(empType1);
		System.out.println(dailyWage);
	
	}

}
