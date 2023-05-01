package bridge;

public class Uc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Welcome to Employee");
		
	int perHour = 20;
	int fullDayHour = 8 ;
	int partTimeHour = 4 ;
		
	int attendance = (int) (Math.random()*2);
	
	if (attendance == 1)
	{
		int dailyWage = perHour * fullDayHour;
		System.out.println("Employee is present");
		System.out.println("Daily Employee Wage : " +dailyWage);
	
	}
	else
	{
		System.out.println("Employee is absent");
	}
		
	 attendance = (int) (Math.random()*2);
	
	if (attendance == 0)
	{
		int partTimeWage = perHour * partTimeHour ; 
		System.out.println("Employee is present");
		System.out.println("Part time Wage : " +partTimeWage);
	}
	else
	{
		System.out.println("Employee is absent");
	}

	}

}
