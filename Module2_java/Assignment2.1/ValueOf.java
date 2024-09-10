/*
g. Declare a method-local variable number of type byte with some value and 
  convert it to the corresponding wrapper class using Byte.valueOf(). .
  (Hint: Use Byte.valueOf(byte)).

*/

class ValueOf{
	public static void main(String[] args){
		
		byte a=101;
		Byte x = Byte.valueOf(a);
		System.out.println(x);
		
	}
}