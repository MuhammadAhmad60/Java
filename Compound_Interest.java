//Compound Interest Java Program

public class Compound_Interest {
    public static void main(String[] args) {
        double Amount  ;      // A: is the future value of the investment/loan, including interest.
        double Principle = 2000;   // is the principal investment amount (the initial deposit or loan amount).
        double rate = 3.0;    //  is the annual interest rate (as a decimal).
        int n = 1;   // is the number of times that interest is compounded per year.
        int time = 3; // years

        /*
         Formula
          amount = principal * Math.pow((1 + rate / (100 * n)), n * time);
        */

        Amount = Principle * Math.pow((1 + rate / (100 * n)), n * time );

        System.out.printf("Compound Interest after %d years: %.2f%n", time, Amount);



    }
}
