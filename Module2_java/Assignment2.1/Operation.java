/**
10. Arithmetic Operations with Command Line Input
Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the command line. 
Perform the specified arithmetic operation based on the operator provided. (Hint: Use switch-case for operations).
*/
import java.util.*;
class Operation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any one operator-: +,-,*,/");
		char math = sc.next().charAt(0);
		
		switch(math){
			
			case '+':
				int a= sc.nextInt();
				int b=sc.nextInt();
				int sum = a+b;
				System.out.println("Addition of num is:: "+sum);
				break;
			
			case '-':
				int c= sc.nextInt();
				int d=sc.nextInt();
				int sub = c-d;
				System.out.println("Substraction of num is:: "+sub);
				break;
				
			case '*':
				int e= sc.nextInt();
				int f=sc.nextInt();
				int mult = e*f;
				System.out.println("Multiplication of num is:: "+mult);
				break;
			
			case '/':
				int g= sc.nextInt();
				int h=sc.nextInt();
				int div = g/h;
				System.out.println("Division of num is:: "+div);
				break;
				
			
		}
		sc.close();
	}
}