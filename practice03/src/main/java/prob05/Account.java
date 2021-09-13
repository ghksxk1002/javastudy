package prob05;

public class Account {
	private String accountNo;
	private int balance = 0;
<<<<<<< HEAD

	public Account(String accontNo) {
		this.accountNo = accontNo;
	}

	public void save(int balance) {

		this.balance += balance;

	}

	public void deposit(int balance) {

		this.balance -= balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNp) {
		this.accountNo = accountNp;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

=======
	
	
	public Account(String accontNo) {
		this.accountNo = accontNo;	
	}
	
	public void save(int balance) {
		
		this.balance += balance;
		
	}

	public void deposit(int balance) {
		
		this.balance -= balance;
	}
	
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNp) {
		this.accountNo = accountNp;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}





	




	
	
	
	
	
>>>>>>> branch 'master' of https://github.com/ghksxk1002/javastudy.git
}
