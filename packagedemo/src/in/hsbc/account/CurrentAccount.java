package in.hsbc.account;

public class CurrentAccount {
	void show() {
		SavingAccount sa=new SavingAccount();
		System.out.println(sa.accountNumber);
		System.out.println(sa.name);
		sa.displayProfile();
		
	}
}
