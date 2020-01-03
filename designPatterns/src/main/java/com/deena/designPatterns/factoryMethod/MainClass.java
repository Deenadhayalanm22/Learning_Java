package com.deena.designPatterns.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws IOException {
		System.out.print("Enter the name of plan for which the bill will be generated: ");  
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	    String planName=br.readLine();  
	    System.out.print("Enter the number of units for bill will be calculated: ");  
	    int units=Integer.parseInt(br.readLine()); 
	    
	    FactoryBean b = new FactoryBean();
	    Plan p = b.getPlan(planName);
	    p.getRate(); 
	    System.out.println(p.calculateBill(units));

	}

}
