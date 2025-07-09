package Intermidate_java.src;

public class Future_Investment {
    public static void main(String[] args) {
        int pv = 1000; // pv stand for present value of the product
        double annual_rate = 5; // in %
        int years = 5;
        double rate = annual_rate / 100; // Interest rate
        int times_compound = 12;

        double FV = pv * Math.pow(1 + rate / times_compound, times_compound * years);

        System.out.println("The future investment value is " + FV);
    }
}
