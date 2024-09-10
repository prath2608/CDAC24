/*
e. Declare a method-local variable strNumber of type String with some value and 
   convert it to a byte value using the parseByte method. .
*/

class ToByte{
	public static void main(String[] args){
		
		String str = "110";
		
		Byte x = Byte.parseByte(str);
		System.out.println(x);
		
	} 
}