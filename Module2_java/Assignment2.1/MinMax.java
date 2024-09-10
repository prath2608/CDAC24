package Long;
/*. Declare two long variables with values 1122 and 5566, and find the 
 minimum and maximum values using the Long class. (Hint: Use Long.min(long, long) and Long.max(long, long)). */
public class MinMax {
    public static void main(String[] args) {
        long a=1122;
        long b=5566l;

        long x= Long.min(a, b);
        long y= Long.max(a, b);
        System.out.println(x);
        System.out.println(y);


    }
    
}
