
public interface AccountSpecification {
	
	public boolean withdraw(double amount);
	
	public void deposit(double amount);
	
	public double getBalance();
	
	public default AccountType getAccountType(){
		return AccountType.CREDIT;
	}; 
	
}
