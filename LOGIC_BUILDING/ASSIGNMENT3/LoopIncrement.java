public class LoopIncrement { 
 public static void main(String[] args) { 
 int count = 0; 
 for (int i = 0; i < 4; i++) { 
 count += i++ - ++i; 
 } 
 System.out.println(count); 
 } 
} 
// Guess the output of this code snippet

/*

i=0  i < 4 true
count += i++ - ++i; 

count = 0+0-2;
count=-2;

i=2 i<4 true
count += i++ - ++i; 

count= -2+2-4
count=-4

i=4 i<4 false

*/