import java.util.Scanner;

public class Product_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = input.nextInt();
        int result = product(num1, num2);
        System.out.println("The product of two Numbers are : " + result );
    }
    public static int product(int num1, int num2){
        return num1 * num2;
    }
}
