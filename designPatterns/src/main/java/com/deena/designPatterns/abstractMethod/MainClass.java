package com.deena.designPatterns.abstractMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	private static final String LOAN = "Loan";
	private static final String BANK = "Bank";

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		
		System.out.println("1.HDFC\n2.ICICI\n3.SBI\n");
		System.out.print("Enter the name of Bank from where you want to take loan amount: "); 
		int bankOption=Integer.parseInt(br.readLine());
		
		AbstractFactory a = FactoryCreator.getFactory(BANK);
		Bank b = a.getBankName(bankOption);
		  
		System.out.print("\n");  
		System.out.println("1.Home Loan\n2.Business Loan\n3.Personal Loan\n4.Educational Loan\n");
		System.out.print("Enter the type of loan : "); 
		int loanType=Integer.parseInt(br.readLine()); 
		
		System.out.print("Enter the loan amount you want to take: ");  
		  
		double loanAmount=Double.parseDouble(br.readLine());  
		System.out.print("\n");  
		System.out.print("Enter the number of years to pay your entire loan amount: ");  
		int years=Integer.parseInt(br.readLine());  
		
		AbstractFactory a1 = FactoryCreator.getFactory(LOAN);
		Loan l = a1.getLoan(loanType);
		
		l.getInterestRate(b);
		System.out.println("Your EMI would be : "+ l.calculateLoanAmount(loanAmount, years));

	}

}
