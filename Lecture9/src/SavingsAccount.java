
public class SavingsAccount implements AccountSpecification {
	
	private double balance;
	private AccountType accType=AccountType.SAVINGS;
	
	public SavingsAccount() {
		super();
	}


	public SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(this.balance>=amount && amount>0){
			this.balance = this.balance - amount;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance=balance+amount+amount*0.01;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}


	public AccountType getAccType() {
		return accType;
	}


	public void setAccType(AccountType accType) {
		this.accType = accType;
	}
	public AccountType getAccountType(){
		return accType;
	}
}
