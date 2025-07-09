package Intermidate_java.src;
//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of
// positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero


import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum_neg = 0;
        int sum_even = 0;
        int sum_odd = 0;
        int number;
        System.out.println("Enter numbers (0 to stop): ");

        while (true){
            number = input.nextInt();

            if (number == 0){
                break;
            }
            if (number < 0){
                sum_neg += number;
            } else if (number % 2 == 0) {
                sum_even += number;
            }else {
                sum_odd += number;
            }
        }
        System.out.println("Sum of negative numbers: " + sum_neg);
        System.out.println("Sum of positive even numbers: " + sum_even);
        System.out.println("Sum of positive odd numbers: " + sum_odd);
    }
}
