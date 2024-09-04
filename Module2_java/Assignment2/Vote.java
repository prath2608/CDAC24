//3)Write a program that checks if a person is eligible to vote based on their age.

import java.util.*;
class Vote{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age>=18){
			System.out.println("you are eligible for vote");
		}
		else{
			System.out.println("sorry you are not eligible for vote");
		}
		
	}
}