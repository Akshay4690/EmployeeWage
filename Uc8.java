package bridge;

import java.util.Random;
public class Uc8 {

	    private final String companyName;
	    private final int wagePerHour;
	    private final int fullDayHour;
	    private final int partTimeHour;
	    private final int workingDaysPerMonth;
	    private final int workingHoursPerMonth;

	    public Uc8(String companyName, int wagePerHour, int fullDayHour, int partTimeHour, int workingDaysPerMonth, int workingHoursPerMonth) {
	        this.companyName = companyName;
	        this.wagePerHour = wagePerHour;
	        this.fullDayHour = fullDayHour;
	        this.partTimeHour = partTimeHour;
	        this.workingDaysPerMonth = workingDaysPerMonth;
	        this.workingHoursPerMonth = workingHoursPerMonth;
	    }

	    public void computeEmployeeWage() {
	        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	        int totalWage = 0;
	        int totalWorkingDays = 0;
	        int totalWorkingHours = 0;
	        while (totalWorkingDays < workingDaysPerMonth && totalWorkingHours < workingHoursPerMonth) {
	            totalWorkingDays++;
	            int employeeType = new Random().nextInt(3);
	            int dailyWage = 0;
	            switch (employeeType) {
	                case 1:
	                    dailyWage = wagePerHour * fullDayHour;
	                    totalWorkingHours += fullDayHour;
	                    break;
	                case 2:
	                    dailyWage = wagePerHour * partTimeHour;
	                    totalWorkingHours += partTimeHour;
	                    break;
	                default:
	                    break;
	            }
	            totalWage += dailyWage;
	        }
	        System.out.println("Total Wage for the month for " + companyName + " is: " + totalWage);
	    }

	    public static void main(String[] args) {
	    	Uc8 company1 = new Uc8("Company1", 20, 8, 4, 20, 100);
	        company1.computeEmployeeWage();

	        Uc8 company2 = new Uc8 ("Company2", 25, 7, 3, 25, 120);
	        company2.computeEmployeeWage();
	    }
	}



