
public class Client {

	private String name;
	private Account savingsAccount;
	private Account creditAccount;
	
	public Client(String name, Account savingsAccount, Account creditAccount) {
		super();
		this.name = name;
		this.savingsAccount = savingsAccount;
		this.creditAccount = creditAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(Account savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public Account getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(Account creditAccount) {
		this.creditAccount = creditAccount;
	}

	public void depositCredit(double amount){
		creditAccount.deposit(amount);
	}
	public void depositSavings(double amount){
		savingsAccount.deposit(amount);
	}
	public void withdrawCredit(double amount) throws AccountBalanceException{
			creditAccount.withdraw(amount);
		
	}
	public void withdrawSavings(double amount) throws AccountBalanceException{
		savingsAccount.withdraw(amount);
	}
	
	public double getBalanceCredit(){
		return creditAccount.getBalance();
	}
	
	public double getBalanceSavings(){
		return savingsAccount.getBalance();
	}
	
	/*public boolean transfer(Account from, Account to, double amount){
		if(from.withdraw(amount)){
			to.deposit(amount);
			return true;
		}else{
			return false;
		}
	}*/
	public void transfer(Account from, Account to, double amount) throws AccountBalanceException{
		try{
			from.withdraw(amount);
		}catch(AccountBalanceException ex){
			ex.getMessage();
			throw new AccountBalanceException("not enough money in account!");
		}
		to.deposit(amount);
	}
}
