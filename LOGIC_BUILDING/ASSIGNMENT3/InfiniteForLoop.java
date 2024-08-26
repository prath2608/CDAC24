public class InfiniteForLoop { 
	public static void main(String[] args) { 
		for (int i = 0; i < 10; i++) { 
			System.out.println(i); 
		} 
	} 
} 

/*
	Error to investigate: 
	Why does this loop run infinitely? 
		- i is less than 10 and i is decrement i-- thats why
		loop never end.
	How should the loop control variable be adjusted?
		- we should be increment means i++ for adjusted
	
*/