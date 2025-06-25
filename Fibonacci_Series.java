// Fibonacci Series In Java Programs

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of fibonacci Number : ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++){
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(" " + b);
        }
    }
}
