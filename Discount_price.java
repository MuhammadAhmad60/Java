// Calculate Discount Of Product

public class Discount_price {
    public static void main(String[] args) {
        int discount = 20;  // the discount percentage is  20%
        int real_price = 50; // original price of product $
        int discounted_price;


        int discount_amount = (real_price * discount ) / 100;
        discounted_price = real_price - discount_amount;
        System.out.println("The discount amount of your product is  " + discounted_price);
    }
}
