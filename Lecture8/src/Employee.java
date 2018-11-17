
public class Employee {
	private String fullName;
	private Company company;
	private int employeeNumber;
	private String position;
	private String phone;
	private String address;
	private double salary;
	private String working_time;
	private int full;
	private int part;
	public Employee(){
		
	}
	
	public Employee(String fullName, Company company, int employeeNumber, String position, String phone, String address,
			double salary, String working_time) {
		super();
		this.fullName = fullName;
		this.company = company;
		this.employeeNumber = employeeNumber;
		this.position = position;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
		this.working_time = working_time;
		Company.setEmp_counter(Company.getEmp_counter()+1);
		if(working_time.equalsIgnoreCase("fulltime")){
			full++;
			Company.setFullTime(full);
		}else{
			part++;
			Company.setPartTime(part);
		}
		if(Company.getMinSalary()!=null){
			if(Company.getMinSalary().getSalary()>salary){
				Company.setMinSalary(this);
			}
		}else{
			Company.setMinSalary(this);
		}
		if(Company.getMaxSalary()!=null){
			if(Company.getMaxSalary().getSalary()<salary){
				Company.setMaxSalary(this);
			}
		}else{
			Company.setMaxSalary(this);
		}
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getWorking_time() {
		return working_time;
	}

	public void setWorking_time(String working_time) {
		this.working_time = working_time;
	}
	public void printEmpDetails(){
		System.out.println("Fullname of employee is: "+fullName+" ,company is: "+ " ,employee number is: " + employeeNumber+" ,position of Employee is: "
				+position+" ,phone: "+phone+" ,address is: "+address+" ,salary is: "+salary+" ,working time is: "+working_time);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Company c =new Company();
		Employee e =new Employee("vlad",c,123,"pos","864","add",123,"fulltime");
		e.printEmpDetails();*/
		
	}

}
