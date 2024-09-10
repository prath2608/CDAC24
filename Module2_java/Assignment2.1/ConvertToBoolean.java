/*
c. Declare a method-local variable strStatus of type String with the 
   value "true" and convert it to a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)).
*/

class ConvertToBoolean{
	public static void main(String[] args){
		String str = "true";
		boolean y = Boolean.parseBoolean(str);
		System.out.println(y);
	}
}