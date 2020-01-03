package com.deena.designPatterns.abstractMethod;

public class ICICI implements Bank{
	
	private final String bName;
	private Double interest;
	
	private LoanType loanType;
	
	public ICICI(){
		bName = "ICICI";
	}

	public String getBankName() {
		return bName;
	}
	
	public Double getInterestRate(LoanType loanType) {
		if(loanType == LoanType.EDUCATION_LOAN)
			interest=3.7;
		else if(loanType == LoanType.HOME_LOAN)
			interest=6.8;
		else if(loanType == LoanType.BUSINESS_LOAN)
			interest=9.1;
		else if(loanType == LoanType.PERSONAL_LOAN)
			interest=12.9;
		else
			interest = 0.0;
		return interest;
	}

}
