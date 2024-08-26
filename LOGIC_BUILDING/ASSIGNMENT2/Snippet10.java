class Snippet10 {
	public static void main(String[] args) {
		System.out.println("No parameters");
 
		int num=10;
		System.out.println("With parameter: " + num);
		
	

 }
} 


/*

java:9: error: non-static method display() cannot be referenced from a static context display();
				
java:10: error: non-static method display(int) cannot be referenced from a static context display(5

Is method overloading allowed?-- No
 

*/