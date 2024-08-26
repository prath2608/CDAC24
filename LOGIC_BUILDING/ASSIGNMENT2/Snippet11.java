public class Snippet11 {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[2]);

 }
} 


/*

.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Snippet11.main
		
		Why does it occur? --- Array index always start form  0 to n-1 ----
		
*/