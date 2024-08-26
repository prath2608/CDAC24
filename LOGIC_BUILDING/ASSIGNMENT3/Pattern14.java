/*
14. Write a program to print the following pattern: 
 *  			1
 ** 			2
 *** 			3
 ***** 			5
 ******* 		7
 *********		9
 */


class Pattern14{
	public static void main(String args[]){
		
		
		
		
		
		
	
		System.out.println("*");
		System.out.println("**");
		for(int i=3;i<=10;i+=2){
			
			for(int j=0; j<i;j++){
				
				System.out.print("*");
				
			}
			System.out.println(" ");
			
		} 
	}
}