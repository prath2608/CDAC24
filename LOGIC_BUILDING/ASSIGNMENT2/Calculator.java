/* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b */
import java.util.*;
class Calculator{
	public static void main (String [] args){
		
		// Take input from the user
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");

		double a = sc.nextInt();
		double b = sc.nextInt();
		double x=0 ;
		
		System.out.println("Enter Operator (+,-,*,/): ");
		
		char op = sc.next().charAt(0);
		
		
		switch(op){
			
			case '+':
				x = a + b;
				break;
						
			case '-':
				x = a - b;
				break;
						
			case '*':
				x = a * b;
				break;
			
			case '/':
				x = a / b;
				break;
			
			default : System.out.println("You enter invalid !! ");
						break;
		}
		System.out.println("The final result:");
        System.out.println();
 
        // print the final result
        System.out.println(a + " " + op + " " + b
                           + " = " + x);
	}
}
