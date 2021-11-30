package p06.user_defind_exception;

public class AccountEx {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
//			System.out.println();
			//테스트 할때 사용
			e.printStackTrace();
		}
	}

}
