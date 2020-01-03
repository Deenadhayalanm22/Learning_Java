package com.deena.designPatterns.abstractMethod;

public class HomeLoan extends Loan{
	
	@Override
	void getInterestRate(Bank b) {
		rate= b.getInterestRate(LoanType.HOME_LOAN);				
	}

}
