import java.util.Scanner;

class BMITracker{
    double weight;
    double height;

    Scanner sc = new Scanner(System.in);
    
    public BMITracker()
    {

    }
    
    public void setWeight(double  weight) {
        this.weight=weight;
    }

    public void setHeight(double  height) {
      this.height=height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWeight(){
        return this.weight;
    }
}
class BMITrackerUtil {
    Scanner sc = new Scanner(System.in);
    BMITracker B1=new BMITracker();

    public void acceptRecord()
    {
        System.out.println("enter height in meter");
        double height = sc.nextDouble();
        B1.setHeight(height);

        System.out.println("enter weight in kg");
        double weight=sc.nextDouble();
        B1.setWeight(weight);
    }
    public void  printRecord()
    {
        System.out.println(B1.getHeight());
        System.out.println(B1.getWeight());
    }
    public double menuList(){
        double BMI = B1.weight/(B1.height*B1.height);
        return BMI;
    }
   
}
public class Program{
    public static void main(String[] args) {
    BMITrackerUtil B1 = new BMITrackerUtil();
    B1.acceptRecord();
    //B1.printRecord();
    double BMI = B1.menuList();

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
          System.out.println("enter values again");     
     }
     
}
}