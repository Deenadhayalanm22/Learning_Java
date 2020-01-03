package com.deena.designPatterns.abstractMethod;

abstract class Loan {
	
	protected double rate; 
	abstract void getInterestRate(Bank b);
	public Double calculateLoanAmount(double loanamount, int years) {
		
		double EMI;  
        int n;  
 
        n=years*12;  
        rate=rate/1200;  
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
        
        return EMI;		
	}
}
