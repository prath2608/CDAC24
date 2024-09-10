/*
8. Conversion between Primitive Types and Strings
Initialize a variable of each primitive type with a user-defined value and convert it into String:
First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
Then, use the valueOf method of the String class. (e.g., String.valueOf()).
*/

import java.util.*;
class Conversion{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Boolean");
		boolean num1=sc.nextBoolean();
		String a = Boolean.toString(num1);
		System.out.println("Boolean to string:: "+a);
		//String.valueOf()
		String y = String.valueOf(num1);
		System.out.println("valueOf: "+y);
		
		
		
		
		System.out.println("Byte");
		byte num2 = sc.nextByte();
		String b = Byte.toString(num2);
		System.out.println("Byte to string:: "+b);
		//String.valueOf()
		String x = String.valueOf(num2);
		System.out.println("valueOf: "+x);
		
		
		System.out.println("Character");
		char num3 = sc.next().charAt(0);
		String c = Character.toString(num3);
		System.out.println("Char to string:: "+c);
		//String.valueOf()
		String z = String.valueOf(num3);
		System.out.println("valueOf: "+z);
		
		System.out.println("Short");
		short num4 = sc.nextShort();
		String d = Short.toString(num4);
		System.out.println("Short to string:: "+d);
		//String.valueOf()
		String p = String.valueOf(num4);
		System.out.println("valueOf: "+p);
		
		System.out.println("Integer");
		int num5 = sc.nextInt();
		String e = Integer.toString(num5);
		System.out.println("Integer to string:: "+e);
		//String.valueOf()
		String q = String.valueOf(num5);
		System.out.println("valueOf: "+q);
		
		System.out.println("Float");
		float num6 = sc.nextFloat();
		String f = Float.toString(num6);
		System.out.println("Float to string:: "+f);
		//String.valueOf()
		String s = String.valueOf(num6);
		System.out.println("valueOf: "+s);
		
		System.out.println("Double");
		double num7 = sc.nextDouble();
		String g = Double.toString(num7);
		System.out.println("Double to string:: "+g);
		//String.valueOf()
		String r = String.valueOf(num7);
		System.out.println("valueOf: "+r);
		
		System.out.println("Long");
		long num8 = sc.nextLong();
		String h = Long.toString(num8);
		System.out.println("Long to string:: "+h);
		//String.valueOf()
		String t = String.valueOf(num8);
		System.out.println("valueOf: "+t);
		
		sc.close();
		
		
		
		
	}
}