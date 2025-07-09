// Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by the user.

import java.util.Scanner;

public class Max_Min_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first numbers :");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number");
        int num2 = input.nextInt();
        System.out.println("Enter third Number ");
        int num3 = input.nextInt();
        System.out.println(largest(num1, num2, num3));
        System.out.println(smallest(num1, num2, num3));

    }
    public static int largest(int num1, int num2, int num3){
        int max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num2 < max){
            max = num3;
        }
        System.out.println("the largest number is " + max);
        return max;

    }

    public static int smallest(int num1, int num2, int num3){
        int min = num1;
        if (num2 < min){
            min = num2;
        }
        if (num3 < min){
            min = num3;
        }
        System.out.println("the smallest number is :" + min);
        return min;
    }
}
