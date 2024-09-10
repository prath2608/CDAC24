package Org.examample.main;

import java.util.Scanner;

//  2. Compound Interest Calculator for Investment
//Develop a system to compute the future value of an investment with compound interest. The system should:
//Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
//Calculate the future value of the investment using the formula:
//Future Value Calculation:
//futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
//Total Interest Earned: totalInterest = futureValue - principal
//Display the future value and the total interest earned, in Indian  (₹).
//Define the class CompoundInterestCalculator with fields, an appropriate constructor, getter and setter methods, 
//a toString method and business logic methods. Define the class CompoundInterestCalculatorUtil with methods acceptRecord, 
//printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.



class CompoundInterestCalculator{
	private double principal;
	private double annualInterestRate;
	private double numberOfCompounds;
	private double years;
	private double futureValue;
	private double totalInterest;
	
	
	
	
	
	public double getTotalInterest() {
		return totalInterest;
	}

	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}

	public double getFutureValue() {
		return futureValue;
	}

	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}

	public  CompoundInterestCalculator() {}
	
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getNumberOfCompounds() {
		return numberOfCompounds;
	}
	public void setNumberOfCompounds(double numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}
	public double getYears() {
		return years;
	}
	public void setYears(double years) {
		this.years = years;
	}
	
	
	
	
	
	
	
}

class CompoundInterestCalculatorUtil{
	CompoundInterestCalculator cmp = new CompoundInterestCalculator();
	private Scanner sc = new Scanner(System.in);
	
	public void acceptRecords() {
		System.out.println("Enter Principle Amount:: ");
		cmp.setPrincipal(sc.nextDouble());
		cmp.getPrincipal();
		sc.nextLine();
		System.out.println("Enter Annual Intrest:: ");
		cmp.setAnnualInterestRate(sc.nextDouble());
		cmp.getAnnualInterestRate();
		System.out.println("Enter Number of Compounds:: ");
		cmp.setNumberOfCompounds(sc.nextDouble());
		cmp.getNumberOfCompounds();
		System.out.println("Enter Years:: ");
		cmp.setYears(sc.nextDouble());
		cmp.getYears();
		
	}
	
	
	
	public double Calculation() {
		//principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
		cmp.setFutureValue(cmp.getPrincipal()*Math.pow((1+cmp.getAnnualInterestRate()/cmp.getNumberOfCompounds()),(cmp.getNumberOfCompounds()*cmp.getYears())));
		cmp.getFutureValue();
		
		return cmp.getFutureValue();
		
		
		
		
		
	}
	
	public void printRecords() {
		System.out.println(cmp.getFutureValue());
		
		
	}
	

}




public class Project2 {
	
	public static void main(String[] args) {
	
	CompoundInterestCalculatorUtil util = new CompoundInterestCalculatorUtil();
	
	util.acceptRecords();
	util.Calculation();
	util.printRecords();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
