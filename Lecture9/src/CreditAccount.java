
public class CreditAccount implements AccountSpecification {

	private double balance;
	
	public CreditAccount(){
		super();
	}
	
	public CreditAccount(double balance) {
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
			this.balance = this.balance - amount -amount*0.03;
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance=balance+amount;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
}
