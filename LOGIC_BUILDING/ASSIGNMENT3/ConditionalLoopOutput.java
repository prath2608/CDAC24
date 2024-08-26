public class ConditionalLoopOutput { 
 public static void main(String[] args) { 
 int num = 1; 
	for (int i = 1; i <= 4; i++) { 
		if (i % 2 == 0) { 
			num += i; 
		} 
		else { 
			num -= i; 
		} 
 } 
 System.out.println(num); 
 } 
} 
/* Guess the output of this loop. 

i=1 -- if block false -> else-- num=1-1=0;
i=2 -- if block true  -> num=0+2 = 2;
i=3 -- if block false -> else-- num= 2-3=-1;
i=4 -- if block true  -> num=-1+4=3;
*/