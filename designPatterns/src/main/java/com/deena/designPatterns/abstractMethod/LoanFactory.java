package com.deena.designPatterns.abstractMethod;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBankName(int option) {
		return null;
	}

	@Override
	public Loan getLoan(int option) {
			if(option==1){  
			 return new HomeLoan();  
			} else if(option==2){  
			 return new BusinessLoan();  
			} else if(option==3){  
			 return new PersonalLoan();  
			} else {  
				 return new EducationalLoan();  
			}
	}
}
