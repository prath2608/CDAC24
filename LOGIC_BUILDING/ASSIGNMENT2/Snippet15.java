public class Snippet15 {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 double result = num1 + num2;
 System.out.println(result);
 }
} 

/*
 incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;
 
  How should you handle different data types
in operations?---- Always a take a big datatype in  size to convert the result in two different datatype


 */