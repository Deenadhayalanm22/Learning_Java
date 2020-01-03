package com.deena.designPatterns.abstractMethod;

public class EducationalLoan extends Loan{

	@Override
	void getInterestRate(Bank b) {
		rate= b.getInterestRate(LoanType.EDUCATION_LOAN);				
	}

}
