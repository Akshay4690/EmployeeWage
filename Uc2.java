package bridge;

public class Uc2 {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee");
		
		int present = (int) (Math.random()*2);
		
		if (present == 1)
		{
			System.out.println("Employee is present");
	
			int perHour = 20;
			int fullDayHour = 8 ;
			int dailyWage = perHour * fullDayHour;
		
			System.out.println("Daily Employee Wage : " +dailyWage);
		}
		else
		{
			System.out.println("Employee is absent");
		}
		
		
	}

}
