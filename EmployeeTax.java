import java.util.*;
import  com.example.tax.*;


public class EmployeeTax {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		
		
		Scanner sal = new Scanner(System.in);
		
		
		
		System.out.print("Enter the salary : ");
		float basicSalary = sal.nextFloat() ;
		
		TaxCalculator obj = new TaxCalculator() ;
		obj.calculateTax(basicSalary);
		obj.deductTax();
		obj.validateSalary();
		
		
	}

}
