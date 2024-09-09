import java.util.Scanner;
class DiscountCalculator{

    private double originalPrice;
    private double discountRate;
    public double discountAmount;
    public double finalPrice;

    public DiscountCalculator(){}


    public double getOrignalPrice(){
        return originalPrice;
    }
    public void setOrignalPrice(double originalPrice){
        this.originalPrice=originalPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
    public double getFinalPrice() {
        return finalPrice;
    }


    

    
}

class DiscountCalculatorUtil{

    DiscountCalculator d = new DiscountCalculator();
    Scanner sc = new Scanner(System.in);

    public void acceptRecord(){
        System.out.print("Orignal value of Product:: ");
        d.setOrignalPrice(sc.nextDouble());
        d.getOrignalPrice();

        System.out.print("discount Rate  on Product(in %):: ");
        d.setDiscountRate(sc.nextDouble());
        d.getDiscountRate();
        System.out.println();
        
    }

    public void printRecord(){
        System.out.println("Orignal price:: "+d.getOrignalPrice());
        System.out.println("DiscountRate:: "+d.getDiscountRate());
        System.out.println();
    }

    public double menuList(){
       

        d.setDiscountAmount(d.getOrignalPrice() * (d.getDiscountRate() / 100));
        System.out.println("I give you Discount RS. :: "+d.getDiscountAmount());

        System.out.println();


        d.setFinalPrice(d.getOrignalPrice() - d.getDiscountAmount());
        System.out.println("Now Please Pay Money RS. :: "+d.getFinalPrice());
        System.out.println();

        return d.getFinalPrice();
        
    }

    
    public String toString(){
        return String.format("%-18s,%-20f"," You get best price after discount ::  ", d.getFinalPrice());
    }

    
    

}

public class Project4 {
    public static void main(String[] args) {

        DiscountCalculatorUtil util = new DiscountCalculatorUtil();
        util.acceptRecord();
        util.printRecord();
        util.menuList();
        System.out.println(util.toString());
    }
    
}


/*4. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:

Accept the original price of an item and the discount percentage from the user.

Calculate the discount amount and the final price using the following formulas:
Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
Final Price Calculation: finalPrice = originalPrice - discountAmount

Display the discount amount and the final price of the item, in Indian Rupees (₹).

Define the class DiscountCalculator with fields, an appropriate constructor, getter and setter methods, 
a toString method, and business logic methods. Define the class DiscountCalculatorUtil with methods acceptRecord, printRecord, 
and menuList. Define the class Program with a main method to test the functionality of the utility class.
 */