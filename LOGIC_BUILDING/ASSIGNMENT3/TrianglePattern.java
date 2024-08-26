/*

      *
    * * *
  * * * * *
* * * * * * *

   *
  ***              4 rows
 *****             7 col.
*******
*/

class TrianglePattern{
	public static void main(String agrs[]){
		int n=7;
		
		
		for(int i=1;i<=7;i+=2){
			
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println(" ");	
			
			
		}
		
	}
}

/*
import java.util.*;
class Pattern16{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i+=2){
			
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}*/