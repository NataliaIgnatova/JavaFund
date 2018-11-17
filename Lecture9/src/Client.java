
public class Client {
	private String name;
	private AccountSpecification savingsAccount;
	private AccountSpecification creditAccount;
	
	public Client(String name, AccountSpecification savingsAccount, AccountSpecification creditAccount) {
		super();
		this.name = name;
		this.savingsAccount = savingsAccount;
		this.creditAccount = creditAccount;
	}

	public Client(String name, double save, double credit){
		this.name=name;
		AccountSpecification savingsAcc = new SavingsAccount(save);
		AccountSpecification creditAcc = new CreditAccount(credit);
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountSpecification getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(AccountSpecification savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public AccountSpecification getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(AccountSpecification creditAccount) {
		this.creditAccount = creditAccount;
	}
	
	public double getBalanceCredit(){
		return creditAccount.getBalance();
	}
	
	public void withdrawCredit(double amount){
		creditAccount.withdraw(amount);
	}
	
	public void depositCredit(double amount){
		creditAccount.deposit(amount);
	}
	
	public double getBalanceSavings(){
		return savingsAccount.getBalance();
	}
	
	public void withdrawSavings(double amount){
		savingsAccount.withdraw(amount);
	}
	
	public void depositSavings(double amount){
		savingsAccount.deposit(amount);
	}
	
	public boolean transfer(AccountSpecification from, AccountSpecification to, double amount){
		if(from.withdraw(amount)){
			to.deposit(amount);
			return true;
		}else{
			return false;
		}
	}
}
