//Factorial Program In Java

import java.util.Scanner;

public class factorial_in_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++){
            factorial *= i;
            System.out.println(factorial);
        }
    }
}
