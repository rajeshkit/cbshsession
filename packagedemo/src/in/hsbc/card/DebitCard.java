package in.hsbc.card;

import in.hsbc.account.SavingAccount;

public class DebitCard extends SavingAccount{
	void display() {
		
		System.out.println(accountNumber);
		System.out.println(name);
		displayProfile();
		
	}
}
