/*
d. Declare a method-local variable strStatus of type String with the value "1" or "0" and 
   attempt to convert it to a boolean. (Hint: parseBoolean method will not work as expected with "1" or "0").
*/

class Value1{
	public static void main(String[] args){
		String str = "1";
		boolean y = Boolean.parseBoolean(str);
		System.out.println(y);
	}
} 
// out  put  shows false with 1 or 0;