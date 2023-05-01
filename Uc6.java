package bridge;

public class Uc6 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee");
		
		int fullDayHour = 8;
		int partTimeHour = 4;
		int wagePerHour = 20;
		int totalDays = 0;
		int totalHours = 0 ;
		int totalWage = 0 ;
		
		while ( totalDays < 20 && totalHours < 100 )
		{
			int attendance = (int) Math.floor(Math.random() * 10) % 3 ;
			int dailyWage = 0;
			
			switch(attendance)
			{
			case 1:
				totalDays++;
				dailyWage = wagePerHour * fullDayHour ;
				totalHours +=  fullDayHour ;
				break;
				
			case 2 :
				totalDays++;
				dailyWage = partTimeHour * wagePerHour;
				totalHours +=  partTimeHour;
				break;
				
			default :
				break;
			}
			totalWage += dailyWage ;
		}
		
		System.out.println("Total working Days : " +totalDays);
		System.out.println("Total Working Hours : " +totalHours);
		System.out.println("Total Wage : " +totalWage);

	}

}
