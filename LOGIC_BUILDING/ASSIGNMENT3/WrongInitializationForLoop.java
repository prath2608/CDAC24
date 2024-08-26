public class WrongInitializationForLoop { 
	public static void main(String[] args) { 
		for (int i = 0; i< 10; i++) { 
			System.out.println(i); 
		} 
	} 
} 

/*
Error to investigate:
		Why does this loop not print numbers in the expected order?
		because it is an infinite loop
		
		What is the problem with the 
		initialization and update statements in the `for` loop? 
			-  i=0; i<10; i++;
			
*/