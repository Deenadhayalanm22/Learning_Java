package com.deena.designPatterns.abstractMethod;

public class SBI implements Bank{
	
	private final String bName;
	private Double interest;
	
	private LoanType loanType;
	
	public SBI(){
		bName="SBI";
	}

	public String getBankName() {
		return bName;
	}
	
	public Double getInterestRate(LoanType loanType) {
		if(loanType == LoanType.EDUCATION_LOAN)
			interest=3.2;
		else if(loanType == LoanType.HOME_LOAN)
			interest=6.1;
		else if(loanType == LoanType.BUSINESS_LOAN)
			interest=9.6;
		else if(loanType == LoanType.PERSONAL_LOAN)
			interest=11.5;
		else
			interest = 0.0;
		return interest;
	}

}
