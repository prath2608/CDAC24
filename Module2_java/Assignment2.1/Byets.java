/*	b. Write a program to test how many bytes are used to represent a 
	byte value using the BYTES field. (Hint: Use Byte.BYTES).
*/

class Bytes{
	
	public static void main(String args[]){
		
		byte BYTES = 127;
		
		Byte a = Byte.BYTES;
		System.out.println(a);
		
		
	}
}