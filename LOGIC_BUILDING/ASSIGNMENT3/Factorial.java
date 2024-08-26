

//Write a program to compute the factorial of the number 10
import java.util.*;
class Factorial{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		double fact=1;
		
		
		for(int i=1;i<=a;i++){
			fact=fact*i;
		}
		System.out.println(fact);
		
		
	}
}