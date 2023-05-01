package bridge;

public class Uc1{

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee ");
		
		int attendance = (int) (Math.random()*2);
		
		if (attendance == 1)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
		

	}

}
