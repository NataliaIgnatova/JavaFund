
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c =new Company("comp","manager","addres","eik");
		Company b =new Company("comp1","manager1","addres1","eik1");
		Employee emp =new Employee("vlad",c,123,"pos","864","add",123,"fulltime");
		Employee emp1 =new Employee("vlad1",b,1123,"p1os","8164","1add",1123,"parttime");
		emp.printEmpDetails();
		emp1.printEmpDetails();
		c.getEmp_counter();
		System.out.println(b.getEmp_counter());
	}

}
