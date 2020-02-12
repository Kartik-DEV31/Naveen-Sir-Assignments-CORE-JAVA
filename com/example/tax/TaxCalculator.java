package com.example.tax;

public class TaxCalculator {
	float basicSalary  = 0.0f;
	boolean citizenship = false;
	float tax;
	int nettSalary;
	
	public void calculateTax (float basicSalary ) {
		
		float tax ;
		this.basicSalary = basicSalary;
		
		tax = 30*this.basicSalary/100;
		
		System.out.println("The Tax of the employee for the basic salary '" +this.basicSalary+"' is '"+tax+"'");
		
		this.tax = tax;
		
	}
	
	
 public	void deductTax(){
		
		this.nettSalary = (int)(this.basicSalary - this.tax);
		
		System.out.println("The nett Salary of the employee is "+this.nettSalary);
		
	}
	
	
	
 public	void validateSalary() {
		
	if (this.basicSalary > 100000) {
		
		this.citizenship = true;
		System.out.println("The Salary and CitizenShip is   "+this.basicSalary+" ; "+this.citizenship);
	}
	else System.out.println("The Salary and CitizenShip is   "+this.citizenship);
		
	}
	


}
