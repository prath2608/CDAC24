public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num == 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 
/* Error to investigate:  
		What is wrong with the loop condition?
			-- we never assign value in while loop condition. 
			in while condition we can use relational operator like(==)
			
*/
			