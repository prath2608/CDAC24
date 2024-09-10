package Long;
/*k. Declare a long variable with the value 7. Convert it to binary, octal, 
    and hexadecimal strings using methods from the Long class.
    (Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)). */

public class ToBinay {
    public static void main(String[] args) {
        
        long a= 1234567l;

        String x = Long.toBinaryString(a);
        String y = Long.toHexString(a);
        String z = Long.toOctalString(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
    
}
