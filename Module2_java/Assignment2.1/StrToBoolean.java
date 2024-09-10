/*
f. Declare a method-local variable strStatus of type String with the value "true" and 
   convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)).

*/

class StrToBoolean{
	public static void main(String[] args){
		
		String str = "True";
		
		Boolean x = Boolean.valueOf(str);
		System.out.println(x);
		
	}
}