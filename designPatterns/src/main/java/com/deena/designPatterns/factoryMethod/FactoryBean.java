package com.deena.designPatterns.factoryMethod;

public class FactoryBean {
	
	public Plan getPlan(String option) {
		
		if(option.equals("1"))
			return new DomainPlan();
		else if(option.equals("2"))
			return new CommercialPlan();
		else
			return new InstitutionalPlan();		
	}
}
