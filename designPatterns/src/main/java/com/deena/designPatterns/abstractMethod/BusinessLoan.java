package com.deena.designPatterns.abstractMethod;

public class BusinessLoan extends Loan{
	
	@Override
	void getInterestRate(Bank b) {
		rate= b.getInterestRate(LoanType.BUSINESS_LOAN);				
	}

}
