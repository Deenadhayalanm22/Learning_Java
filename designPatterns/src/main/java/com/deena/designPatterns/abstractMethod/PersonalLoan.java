package com.deena.designPatterns.abstractMethod;

public class PersonalLoan extends Loan{

	@Override
	void getInterestRate(Bank b) {
		rate= b.getInterestRate(LoanType.PERSONAL_LOAN);				
	}

}
