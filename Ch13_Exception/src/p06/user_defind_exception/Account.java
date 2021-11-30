package p06.user_defind_exception;
/*
 throw new BalanceInsufficientException("에러메세지 내용");
 => 에러메세지 내용을 만들기 위해, BalanceInsufficientException의
 exception instance를 heap memory에 생성하고, 에러 메세지를 상위 메소드로 전달
 */
public class Account {
	
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance = balance + money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + " 모자람");
		}
		balance = balance - money;
	}
}
