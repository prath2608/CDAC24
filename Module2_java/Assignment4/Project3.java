package Org.examample.main;



///BMI CALCULATOR

import java.util.Scanner;

class BmiTracker{
    private double weight;
    private double height;
    public double BMI;

    public BmiTracker(){}

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI(){
        return BMI;
    }
    public void setBMI(double BMI){
        this.BMI=BMI;
    }
}

class BmiTrackerUtil {
    Scanner sc = new Scanner(System.in);
    BmiTracker bmi = new BmiTracker();

    public void acceptRecords(){
        
        System.out.println("Enter your weight(In kgs):: ");
        bmi.setWeight(sc.nextDouble());
         bmi.getWeight();

        System.out.println("Enter your height(In meter):: ");
        bmi.setHeight(sc.nextDouble());
        bmi.getHeight();
    }

    public double printRecords(){

        bmi.setBMI(bmi.getWeight()/(bmi.getHeight()*bmi.getHeight()));
        System.out.println(bmi.getBMI());

       return bmi.getBMI();
        
    }


}




public class Project3{
    public static void main(String[] args) {
     
        
        BmiTrackerUtil util = new BmiTrackerUtil();
        util.acceptRecords();
        
        double BMI = util.printRecords();

        if (BMI < 18.5){
            System.out.println("underweight");
        }
        else if ( BMI >= 18.5  || BMI < 24.9){
           System.out.println("normal weight");
        }
        else if ( BMI >= 25 || BMI < 29.9){
            System.out.println("overweight");
           }
        else if (BMI >= 30){
            System.out.println("obese");
        }
         else{
              System.out.println("I request you please loose your weight... sorry");     
         }
        

        

       
    }
    
}
