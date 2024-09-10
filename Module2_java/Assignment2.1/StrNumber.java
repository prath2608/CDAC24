/*
f. Declare a method-local variable strNumber of type String with 
   the value "Ab12Cd3" and attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).

*/

class StrNumber{
	public static void main(String[] args){
		
		String str = "A1B2C3";
		Byte x = Byte.parseByte(str);
		System.out.println(x);
		
	}
}

//parseByte method will throw a NumberFormatException