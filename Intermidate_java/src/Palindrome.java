package Intermidate_java.src;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :"); // Enter the number to check weather the number is palindrome or not
        int n = input.nextInt();
        int original = n;
        int reversed = 0;

        while (n > 0){
            int rem = n % 10;
            n /= 10;
            reversed = reversed * 10 + rem;

        }
        if (reversed == original){
            System.out.println("The number is palindrome " + reversed);
        }else {
            System.out.println("The number is not a palindrome number ");
        }

    }
}
