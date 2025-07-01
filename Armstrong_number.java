// Armstrong Number In Java

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the an Number ");
        int n = input.nextInt();
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum  = sum + rem*rem*rem*rem;
        }
        if (sum == original){
            System.out.println("The number is an Armstrong number :" + original );
        }else {
            System.out.println("The number is not an Armstrong number");
        }
    }
}
