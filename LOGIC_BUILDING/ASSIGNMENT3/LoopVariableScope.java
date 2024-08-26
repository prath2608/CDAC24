public class LoopVariableScope { 
 public static void main(String[] args) { 
	 int x=1;
 for (int i = 0; i < 5; i++) { 
		x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 

/* Error to investigate: 
		Why does the variable 'x' cause a compilation error? 
				-- x is accessible only inside for loop. 
		How does scope
				we cant access outside the loop. if we want access make it globle / or define outside for loop.
				
*/