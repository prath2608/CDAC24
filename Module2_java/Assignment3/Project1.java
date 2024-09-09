/**
 * 1. Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan. 
The system should: Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
Calculate the monthly payment using the standard mortgage formula:

Monthly Payment Calculation:
monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12

Note: Here ^ means power and to find it you can use Math.pow( ) method
Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define class LoanAmortizationCalculator with methods acceptRecord, calculateMonthlyPayment & printRecord and test the functionality in main method.

 */

import java.util.Scanner;

/**
  * Project1
  */


  class LoanAmortizationCalculator{
    double loanAmount;
    double interestRate;
    float loanTerm;

    int monthlyInterestRate;
    int numberOfMonths;
    double monthlyPayment;
    double totalPayment;

    Scanner sc = new Scanner(System.in);

    public void acceptRecord(){
        System.out.print("Principle Amount:: ");
        loanAmount=sc.nextDouble();
        System.out.print("Annual Intrest Rate:: ");
        interestRate=sc.nextDouble();
        System.out.print("loan term (In Years):: ");
       loanTerm=sc.nextFloat();

    }

    //Monthly Interest = (Annual Rate / 12) * Principal
    //EMI = P x R x (1+R)^N / [(1+R)^N-1]
  public void calculateMonthlyPayment(){
    monthlyInterestRate = (int)interestRate / 1200;
    numberOfMonths= (int)loanTerm * 12;
    monthlyPayment= (loanAmount * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1));
   

    totalPayment= monthlyPayment*numberOfMonths;

  }



    public void printRecord(){
        System.out.println("month amount:: "+monthlyPayment);
        System.out.println("You are paying in term of "+loanTerm+" years amount is:: "+totalPayment);

    }


  }


 public class Project1 {
    public static void main(String[] args) {
        LoanAmortizationCalculator total = new LoanAmortizationCalculator();
        total.acceptRecord();
        total.calculateMonthlyPayment();
        total.printRecord();
    }
 
    
 }