package prob05;

public class Account {

	private String accountNo;
	private int balance = 0;
	
	
	
	
	
	public Account(String accountNo) {
		
		this.accountNo = accountNo;
		
	}
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public void save(int save) {	
		this.balance += save;
	}
	public void deposit(int deposit) {
		this.balance -= deposit;
	}


}
