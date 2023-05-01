package bridge;

import java.util.Random;

public class Uc7 {
	
	private static final int wagePerHour = 20;
    private static final int fullDayHour = 8;
    private static final int partTimeHour = 4;
    private static final int  dayPerHour = 20;
    private static final int maxHours = 100;
    private static final int maxDays = 20;

    public static void main(String[] args) {
    System.out.println("Welcome to Employee ");

        Random random = new Random();
        int empCheck = random.nextInt(2);
        int empHrs = 0;

        switch (empCheck) {
            case 0:
                System.out.println("Employee is Absent");
                break;
            case 1:
                System.out.println("Employee is Present");
                empHrs = fullDayHour;
                break;

            default:
                break;
	        }

        int dailyWage = empHrs * wagePerHour ;
        System.out.println("Daily Employee Wage: " + dailyWage);

        empCheck = random.nextInt(3);

        switch (empCheck) {
            case 0:
                System.out.println("Part Time Employee");
                empHrs =  partTimeHour;
                break;
            case 1:
                System.out.println("Full Time Employee");
                empHrs = fullDayHour;
                break;
            default:
                System.out.println("Employee is Absent");
                break;
	        }

	        dailyWage = empHrs *wagePerHour;
	        System.out.println("Daily Employee Wage: " + dailyWage);

	        int totalWage = 0;
	        int totalWorkingDays = 0;
	        int totalWorkingHours = 0;

	        while (totalWorkingDays <  partTimeHour && totalWorkingHours <  maxHours) {
	            empCheck = random.nextInt(3);

	            switch (empCheck) {
	                case 0:
	                    empHrs = 0;
	                    break;
	                case 1:
	                    empHrs = fullDayHour;
	                    break;
	                default:
	                    empHrs =  partTimeHour;
	                    break;
	            }

	            totalWorkingDays++;
	            totalWorkingHours += empHrs;
	            totalWage += empHrs * wagePerHour;
	        }

	        System.out.println("Total Employee Wage for the Month: " + totalWage);
	    }
	

	}

