public class MisplacedForLoopBody { 
	public static void main(String[] args) { 
		for (int i = 0; i < 5; i++){
			System.out.println(i); 
			System.out.println("Done"); 
		}
	}
} 

/*Error to investigate: 
	Why does "Done" print only once, outside the loop? 
	
	How should the loop body be enclosed to 
	include all statements within the loop?
	
*/

// when braces not given to for{} then only one statement work . below ARE only one time execute
//{} are compulsory for the execute all statementsn