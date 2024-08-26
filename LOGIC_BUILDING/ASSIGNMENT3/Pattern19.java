/* 19. Write a program to print the following pattern: 
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5  */

import java.util.*;
class Pattern19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
				if(j<i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}
}
