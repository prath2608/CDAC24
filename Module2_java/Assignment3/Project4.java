import java.util.Scanner;

class DiscountCalculator{
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    public void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("price of product:: ");
        originalPrice = sc.nextDouble();
        System.out.println("discount rate (it is in percentage):: ");
        discountRate=sc.nextDouble();
        sc.close();
    }
    public void calculateDiscount(){
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;

    }

    public void printRecord(){
        System.out.println("Amount after getting discount "+ discountRate+" % "+":: RS. "+finalPrice);
    }




}

public class Project4 {
    public static void main(String[] args) {
        DiscountCalculator discount = new DiscountCalculator();
        discount.acceptRecord();
        discount.calculateDiscount();
        discount.printRecord();
        
    }
    
}

/*4. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:
Accept the original price of an item and the discount percentage from the user.

Calculate the discount amount and the final price using the following formulas:
Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
Final Price Calculation: finalPrice = originalPrice - discountAmount
Display the discount amount and the final price of the item, in Indian Rupees (₹).
Define class DiscountCalculator with methods acceptRecord, calculateDiscount & printRecord and test the functionality in main method.
 */