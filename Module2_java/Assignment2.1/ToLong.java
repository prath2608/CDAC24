package Long;
/*Declare a method-local variable strNumber of type String with 
some value and convert it to a long value using the parseLong method.  */
public class ToLong {
    public static void main(String[] args) {
        
        String strNumber="12545";
        Long  x = Long.parseLong(strNumber);
        System.out.println(x);
        
    }
    
}
