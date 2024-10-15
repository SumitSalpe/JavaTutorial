package Constructor;

public class ConstructorwithValidation {

	private String AccountNo;
	private double balance;
	 public ConstructorwithValidation(String AccountNo, double balance)
	 {
		 if(AccountNo == null || AccountNo.isEmpty())
		 {
			 System.out.println("Error: Account number cannot be null or empty.");
			 return;
		 }
		 if(balance < 0)
		 {
			 System.out.println("Error: Balance cannot be negative.");
			 return;
		 }
		this.AccountNo = AccountNo;
		this.balance = balance;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorwithValidation c = new ConstructorwithValidation("72435900004657", 58);
		System.out.println("Account 1 Number: " + c.AccountNo);
        System.out.println("Account 1 Balance: " + c.balance);
	}

}
