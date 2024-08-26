public class UninitializedWhileLoop { 
	public static void main(String[] args) { 
		int count=0;; 
		while (count < 10) { 
			System.out.println(count); 
			count++; 
		} 
	} 
} 
/* Error to investigate: 
		Why does this code produce a compilation error?
			variable count might not have been initialized while (count < 10) 
					
		What needs to be done to initialize the loop 
		int count=0;
variable properly?*/