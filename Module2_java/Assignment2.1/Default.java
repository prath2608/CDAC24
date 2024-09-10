/*
9. Default Values of Primitive Types
Declare variables of each primitive type as fields of a class and check their default values. 
(Note: Default values depend on whether the variables are instance variables or static variables).
*/

class Default{
	
	// field (non static field)
	boolean num1;
	byte num2;
	char num3;
	short num4;
	int num5;
	float num6;
	double num7;
	long num8;
	
	//static field
	static boolean num11;
	static byte num12;
	static char num13;
	static short num14;
	static int num15;
	static float num16;
	static double num17;
	static long num18;
	
	
	public static void main(String[] args){
		
		//field (non static field)
		Default d = new Default();
		
		System.out.println("field (non static field)");
		
		System.out.println("boolean value:: " + d.num1);
		System.out.println("byte value:: " + d.num2);
		System.out.println("char value:: "+d.num3);
		System.out.println("short value:: "+d.num4);
		System.out.println("int value:: " + d.num5);
		System.out.println("float value:: " + d.num6);
		System.out.println("double value:: "+d.num7);
		System.out.println("long value:: "+d.num8);
		
		System.out.println();
		
		//static field execution
		System.out.println("static field execution");
		
		System.out.println("boolean value:: " + Default.num11);
		System.out.println("byte value:: " + Default.num12);
		System.out.println("char value:: "+Default.num13);
		System.out.println("short value:: "+Default.num14);
		System.out.println("int value:: " + Default.num15);
		System.out.println("float value:: " + Default.num16);
		System.out.println("double value:: "+Default.num17);
		System.out.println("long value:: "+Default.num18);
		
		
	
	}
}