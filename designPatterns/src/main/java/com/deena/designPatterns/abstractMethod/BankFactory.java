package com.deena.designPatterns.abstractMethod;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBankName(int option) {
		if(option==1)
			return new HDFC();
		else if(option==2)
			return new ICICI();
		else
			return new SBI();
	}
	
	public Loan getLoan(int loan) {  
	      return null;  
	 }

}
