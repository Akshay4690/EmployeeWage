package bridge;

public class Uc5 {

	public static void main(String[] args) {
		
	System.out.println("Welcome to Employee");
		
		int perHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;
		int perMonth = 20;
		
		int totalWages = 0;
		
		for (int i =1; i <= perMonth; i++)
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3 ;
			int dailyWage = 0 ;
			
			switch (empCheck)
			{
			case 0:
				System.out.println("Day" +i+ ": Employee is absent");
				break;
				
			case 1:
				dailyWage = perHour * fullDayHour ;
				System.out.println("Day" +i+ ": Employee is present in fullDay");
				break ;
				
			case 2:
				dailyWage = perHour * partTimeHour ;
				System.out.println("Day" +i+ ": Employee is present in part-time");
				
			default :
				System.out.println("Invalid Input");
				break;
			
			}
			
			totalWages += dailyWage ;
		}
		System.out.println("Total wages for month: " +totalWages);
	}

}
