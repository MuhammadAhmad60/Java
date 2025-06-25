//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Sum_of{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number (enter 0 to stop) ");
        int sum = 0;
        while (true){
            int num = input.nextInt();

            if (num == 0){
            break;
        }

            sum +=  num;
        }
        System.out.println("Th sum of all numbers " + sum);
    }
}
