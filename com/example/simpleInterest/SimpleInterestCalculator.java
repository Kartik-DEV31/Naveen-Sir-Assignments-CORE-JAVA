package com.example.simpleInterest;


public class SimpleInterestCalculator {
	double principalAmount;
	int numYears;
	double result;
  
	public void calculateSimpleInterest(double principalAmount, int numYears) {
		
		this.principalAmount = principalAmount;
		this.numYears = numYears;
		
		if (this.principalAmount>100000) {
			if (this.numYears>10) {
				this.result=(this.principalAmount*this.numYears*10)/100;
			}
			else if (this.numYears<10) {
				this.result=(this.principalAmount*this.numYears*9.5)/100;
			}
		}
		
		else {
			if(this.numYears>10)
			this.result=(this.principalAmount*this.numYears*5)/100;
			else
			this.result=(this.principalAmount*this.numYears*4.5)/100;
			
		}
		
		System.out.println("The interest amount for a principal of '"+this.principalAmount+"' and years '"+this.numYears+"' is '"+this.result+"' ");
		
	}

}
