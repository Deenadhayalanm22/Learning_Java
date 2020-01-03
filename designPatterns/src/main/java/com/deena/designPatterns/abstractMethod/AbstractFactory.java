package com.deena.designPatterns.abstractMethod;

abstract class AbstractFactory {

	public abstract Bank getBankName(int option);
	
	public abstract Loan getLoan(int option);
}
