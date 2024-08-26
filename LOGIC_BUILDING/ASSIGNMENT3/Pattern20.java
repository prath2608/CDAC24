/* 20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1 */
import java.util.*;
class Pattern20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--){
			
			for(int j=n;j>=i;j--){
				System.out.print(j+" ");
				
				if(j>i){
					System.out.print("* ");
				}
				
			
			}
			System.out.println();
			
		}
		
		
	}
}