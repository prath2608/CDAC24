import java.util.Scanner;

class BMITracker {
    private double weight;
    private double height;
    double BMI;

    public void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (in kilograms):: ");
        weight = sc.nextDouble();

        System.out.print("Enter height (in meters):: ");
        height = sc.nextDouble();
    }

    public void display() {
        BMI = weight / (height * height);
        System.out.println("BMI is:: "+BMI);
        if (BMI < 18.5) {
            System.out.println("underwight");
        }
        else if (BMI>18.5 && BMI < 24.9){
            System.out.println("Normal weight");
        }
            
        else if (BMI>24.9 && BMI < 29.9){
        System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }

    }

   

    
}


public class Project3 {
    public static void main(String[] args) {
        BMITracker bmi = new BMITracker();
        bmi.acceptRecord();
        bmi.display();
       
    }
    
}


/*3. BMI (Body Mass Index) Tracker
Create a system to calculate and classify Body Mass Index (BMI). The system should:
Accept weight (in kilograms) and height (in meters) from the user.
Calculate the BMI using the formula:
BMI Calculation: BMI = weight / (height * height)
Classify the BMI into one of the following categories:
Underweight: BMI < 18.5
Normal weight: 18.5 ≤ BMI < 24.9
Overweight: 25 ≤ BMI < 29.9
Obese: BMI ≥ 30
Display the BMI value and its classification.
Define class BMITracker with methods acceptRecord, calculateBMI, classifyBMI & printRecord and test the functionality in main method */