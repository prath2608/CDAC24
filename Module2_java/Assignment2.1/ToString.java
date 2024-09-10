package Long;
/*Declare a method-local variable number of type long with 
  some value and convert it to a String using the toString method */
public class ToString {
    public static void main(String[] args) {
        long x = 1000L;

        String y = Long.toString(x);
        System.out.println(y);

    }
    
}
