// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int largest = Integer.MIN_VALUE;  // start with the smallest possible integer
        System.out.println("Enter the number (enter the 0 to stop) ");
         while (true){
             number = input.nextInt();

             if (number == 0){
                 break;
             }
             if (number > largest){
                 largest = number;
             }
         }
         if (largest == Integer.MIN_VALUE){
             System.out.println("No number was entered. ");
         } else {
             System.out.println("The largest number is : " + largest);
         }
    }
}
