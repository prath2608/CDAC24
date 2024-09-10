/*
b. Declare a method-local variable status of type boolean with the value true 
   and convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).

*/

class ConvertToString{
	public static void main(String[] args){
		boolean a = true;
		String x = Boolean.toString(a);
		System.out.println(a);
	}
}