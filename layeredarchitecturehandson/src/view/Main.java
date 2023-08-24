package view;

import exception.InvalidEmployeeNumberException;

public class Main {
	public static void main(String[] args) throws InvalidEmployeeNumberException {
			// test all method is in UserUi	
		UserUi ui=new UserUi();
		// add any employee to storage arraylist collection
		ui.acceptEmpDetailsAndStore();
		ui.acceptEmpDetailsAndStore();
		ui.acceptEmpDetailsAndStore();
		ui.displayEmpByEmpNo();
		//ui.displayEmpByEmpNo();
	}
}
