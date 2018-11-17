import java.util.Scanner;

public class FirstTask {
	
	static int employeeNumber;
	static double hourlySalary;
	static int weeklyTime;
	static double regularPay;
	static double overtimePay;
	static double netPay;
	
	public static void employeeData(){
		switch (employeeNumber) {
		case 1234:
			System.out.println("    " + "EmployeeNumber: " + employeeNumber);
			System.out.println("    " + "Employee name: Ivan");
			break;
		case 5712:
			System.out.println("    " + "EmployeeNumber: " + employeeNumber);
			System.out.println("    " + "Employee name: Petar");
			break;
		case 8412:
			System.out.println("    " + "EmployeeNumber: " + employeeNumber);
			System.out.println("    " + "Employee name: Hristo");
			break;
		default:
			System.out.println("    " + "EmployeeNumber: " + employeeNumber);
			System.out.println("    " + "Employee name: Unknown");
			
		}
		int overtime = weeklyTime - 40;
		System.out.println("    " + "Hourly salary: " + hourlySalary);
		System.out.println("    " + "Weekly Time: " + weeklyTime);
		// System.out.println(" "+"Overtime: " + overtime);

		if (weeklyTime <= 40) {
			overtime = 0;
			System.out.println("    " + "Overtime: " + overtime);
			regularPay = weeklyTime * hourlySalary;
			System.out.println("    " + "Regular Pay: " + regularPay);
			System.out.println("    " + "Overtime Pay: " + overtimePay);
			netPay = regularPay + overtimePay;
			System.out.println("    " + "Total Pay: " + netPay);
		} else {
			System.out.println("    " + "Overtime: " + overtime);
			regularPay = weeklyTime * hourlySalary - (weeklyTime - 40) * hourlySalary;
			System.out.println("    " + "Regular Pay: " + regularPay);
			overtimePay = 2 * (weeklyTime - 40) * hourlySalary;
			System.out.println("    " + "Overtime Pay: " + overtimePay);
			netPay = regularPay + overtimePay;
			System.out.println("    " + "Total Pay: " + netPay);

		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employeeNumber: ");
		employeeNumber = input.nextInt();
		System.out.print("Enter hourlySalary: ");
		hourlySalary = input.nextDouble();
		System.out.print("Enter weeklyTime: ");
		weeklyTime = input.nextInt();
		
		System.out.println("==============================");
		System.out.println("===== Employee Payroll =======");
		System.out.println("==============================");
		
		FirstTask empl = new FirstTask();
		empl.employeeData();
		
		System.out.println("==============================");
	}

}
