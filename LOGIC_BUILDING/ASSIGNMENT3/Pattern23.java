/*23. Write a program to print the following pattern: 
11111 
22222 
33333 
44444 
55555 */

import java.util.*;
class Pattern23{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
