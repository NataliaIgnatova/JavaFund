
public class Company {
	private String name;
	private String manager;
	private String address;
	private String eik;
	private static int emp_counter;
	private static Employee minSalary;
	private static Employee maxSalary;
	private static int fullTime;
	private static int partTime;
	
	public Company(){
		
		
	}
	
	public Company(String name, String manager, String address,String eik) {
		super();
		this.name = name;
		this.manager = manager;
		this.address = address;
		this.eik=eik;
	}
	
	public static Employee getMinSalary() {
		return minSalary;
	}

	public static void setMinSalary(Employee minSalary) {
		Company.minSalary = minSalary;
	}

	public static Employee getMaxSalary() {
		return maxSalary;
	}

	public static void setMaxSalary(Employee maxSalary) {
		Company.maxSalary = maxSalary;
	}

	public static int getFullTime() {
		return fullTime;
	}

	public static void setFullTime(int fullTime) {
		Company.fullTime = fullTime;
	}

	public static int getPartTime() {
		return partTime;
	}

	public static void setPartTime(int partTime) {
		Company.partTime = partTime;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getEmp_counter() {
		return emp_counter;
	}

	public static void setEmp_counter(int empcounter) {
		emp_counter = empcounter;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEik() {
		return eik;
	}

	public void setEik(String eik) {
		this.eik = eik;
	}
	public void printCompDetails(){
		System.out.println("Company name is: "+name+" ,comapny manager is: "+manager+" ,company address" +address+" ,company eik is: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
