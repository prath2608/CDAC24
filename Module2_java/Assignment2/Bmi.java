/*
Q2 Implement a program that calculates the Body Mass Index (BMI) based on height and weight input 
using if-else to classify the BMI int categories (underweight, normal weight, overweight,etc).
*/



import java.util.*;

class Bmi{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		double BMI = weight / (height*height);
		
		if(BMI <= 18.4){
			System.out.println("under weight"); 
			
		}
		else if(BMI>=18.5 && BMI<=24.9){
			System.out.println("normal weight");
		}
		
		else if(BMI>25.0 && BMI<=39.9){
			System.out.println("Over weight");
		}
		else{
			System.out.println("Obese");
		}
		
	}
	
}
