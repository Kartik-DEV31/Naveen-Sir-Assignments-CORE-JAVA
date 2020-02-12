import java.util.Scanner;

import com.example.simpleInterest.SimpleInterestCalculator;

public class simpleInterestCalculator {
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
	
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Principal Amount : ");
		double principalAmount = num.nextDouble();		
		System.out.print("Enter the Number of Years : ");
		int numYears = num.nextInt();
		
		SimpleInterestCalculator obj = new SimpleInterestCalculator();
		
		obj.calculateSimpleInterest(principalAmount, numYears);
		
		
	}
	
	

}
