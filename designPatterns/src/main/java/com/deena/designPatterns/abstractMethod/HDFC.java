package com.deena.designPatterns.abstractMethod;

public class HDFC implements Bank{
	
	private final String bName;
	private Double interest;
	
	private LoanType loanType;

	public HDFC() {
		bName="HDFC";		
	}

	public String getBankName() {
		return bName;
	}

	public Double getInterestRate(LoanType loanType) {
		if(loanType == LoanType.EDUCATION_LOAN)
			interest=3.5;
		else if(loanType == LoanType.HOME_LOAN)
			interest=6.5;
		else if(loanType == LoanType.BUSINESS_LOAN)
			interest=9.5;
		else if(loanType == LoanType.PERSONAL_LOAN)
			interest=12.5;
		else
			interest = 0.0;
		return interest;
	}

}
