package Long;
/*Write a program to test how many bytes are used to represent a long value using the BYTES field. (Hint: Use Long.BYTES).
 */

public class Bytes {

    public static void main(String[] args) {
       long BYTES = 127;
		
		Byte a = Long.BYTES;
		System.out.println(a);
    }
    
}
