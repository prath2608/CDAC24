public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num < 6); 
 } 
} 
/* Error to investigate: 
		Why does this loop print unexpected numbers?
		-- first stmt execute 1 is print after 
		num-- (1-1) become 0 and num>0(0>) condition is false.
		
		What adjustments are needed to print the 
		numbers from 1 to 5?
			----in while conditon we write (num<6)
			----in do stmt num-- should become num++
		
*/