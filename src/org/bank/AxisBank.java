package org.bank;

public class AxisBank extends BankInfo {

	private void deposit() {
		System.out.println("deposit");

	}
	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		
		a.saving();
		a.fixed();
		a.deposit(); 
	}
	
}
