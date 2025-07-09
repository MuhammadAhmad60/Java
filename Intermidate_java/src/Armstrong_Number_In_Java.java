package Intermidate_java.src;

import java.util.Scanner;

public class Armstrong_Number_In_Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original){
            System.out.println("The number is Armstrong Number : " + original);
        }else {
            System.out.println("The number is not an ArmStrong number ");
        }
    }
}
