package org.example.main;


/*
 Design and implement a class named InstanceCounter to track and count the number of instances created from this class.
*/


class Instacounter{
	private static int count;
	public static void printCount() {
		count=count+1;
		System.out.println(count);
	}
}

class Project1{
	public static void main (String[] args) {
		Instacounter.printCount();
		Instacounter.printCount();
		Instacounter.printCount();
		Instacounter.printCount();
		Instacounter.printCount();
		Instacounter.printCount();
		Instacounter.printCount();
	}
}

