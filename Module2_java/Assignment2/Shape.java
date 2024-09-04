/*
5)Write a program that allows the user to select a shape
 (Circle, Square, Rectangle, Triangle) 
and then calculates the area based on user-provided dimensions using a switch case
*/

import java.util.*;
class Shape{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter C for Circle, S for Square, R for Rectangle, T for Triangle");

		char shape = sc.next().charAt(0);
		
		switch(shape){
			
			case 'C' :
				System.out.println("Enter Radius");
			    double r = sc.nextDouble();
				
				double circle_a =3.14 * (r*r);
				System.out.println(circle_a);
				break;
				
			case 'S' :
				System.out.println("Enter length"); 
			    double l = sc.nextDouble();
				
				double square_a = (l*l);
				System.out.println(square_a + " sq.m");
				break;
			
			case 'R' :
				System.out.println("Enter length"); 
			    double a = sc.nextDouble();
				System.out.println("Enter breadth");
				double b = sc.nextDouble();
				
				double rect_a = (a*b);
				System.out.println(rect_a + " sq.m");
				break;
			
			case 'T' :
				System.out.println("Enter height"); 
			    double x = sc.nextDouble();
				
				System.out.println("Enter length");
				double y = sc.nextDouble();
				
				double Tri_a = (x*y)/2;
				System.out.println(Tri_a + " sq.m");
				break;				
				
				
		}
		
		
	}
}