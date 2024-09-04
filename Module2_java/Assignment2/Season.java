/*
4)Write a program that takes a month (1-12) and prints the corresponding season (Winter, Spring, Summer, Autumn) using a switch case

*/

import java.util.*;
class Season{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month){
			case 12: 
			case 1 :
			case 2 :System.out.println("winter");
			break;
			
			case 9 : 
			case 10:
			case 11:System.out.println("Autumn");
			break;
			
			case 3 : 
			case 4 :
			case 5 : System.out.println("spring");
			break;
			
			case 6 : 
			case 7 :
			case 8 : System.out.println("Summer");
			break;
			
			default : System.out.println("Bogus month");
			
			
		}
		
	}
}