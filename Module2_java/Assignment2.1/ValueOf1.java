/*
	h. Declare a method-local variable strNumber of type String with some 
	byte value and convert it to the corresponding wrapper class using Byte.
	valueOf(). (Hint: Use Byte.valueOf(String)).
*/

class ValueOf1{
	public static void main(String[] args){
		String strNumber = "20";
		
		Byte x = Byte.valueOf(strNumber);
		System.out.println(x);
	}
}