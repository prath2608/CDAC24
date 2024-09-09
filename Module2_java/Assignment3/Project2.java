import java.util.Scanner;

class CompoundInterestCalculator{
    // A: The future value of the investment 
 
    private double principal; // P: The principal amount invested 
    
    private double annualInterestRate; // r: The annual interest rate as a decimal 
    
    private double numberOfCompounds;// n: The number of times interest is compounded per year 
    
    private double investmentTime;// t: The time in years
    double futureValue;
   


    


    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("The principal amount invested:: ");
        principal=sc.nextDouble();

        System.out.print("The annual interest rate as a decimal:: ");
        annualInterestRate=sc.nextDouble();

        System.out.print("The number of times interest is compounded per year:: ");
        numberOfCompounds=sc.nextDouble();

        System.out.print("The time in years:: ");
        investmentTime = sc.nextDouble();

        sc.close();
    }
     
     
        
    public void earnMoney(){
        //A = P(1 + r/n)nt
        futureValue = principal * (1 + annualInterestRate / numberOfCompounds);Math.pow(numberOfCompounds,investmentTime);
        System.out.println(futureValue);
          
    }

    

}
public class Project2 {
    public static void main(String[] args) {
        CompoundInterestCalculator c1 = new CompoundInterestCalculator();
        c1.acceptRecord();
        c1.earnMoney();
        
        
    }
    
}


/*2. Compound Interest Calculator for Investment
Develop a system to compute the future value of an investment with compound interest. 
The system should:
Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, 
and investment duration (in years) from the user.

Calculate the future value of the investment using the formula:
Future Value Calculation:
futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
Total Interest Earned: totalInterest = futureValue - principal
Display the future value and the total interest earned, in Indian Rupees (₹).
Define class CompoundInterestCalculator with methods acceptRecord , calculateFutureValue, printRecord and test the functionality in main method.

 */
