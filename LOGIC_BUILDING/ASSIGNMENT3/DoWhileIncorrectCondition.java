public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num > 0); 
 } 
}
 
/* Error to investigate: 
		Why does the loop only execute once? 
			always print inside statement and 
			then check the condition thats why 
			one time code execute.
			
		What is wrong with the loop condition 
		in the `dowhile` loop? 
		
				- in this loop its infinite  loop 
				condition become always true;
*/
