import java.util.Scanner;

public class Sum_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the  Number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = input.nextInt();
        sum(num1,  num2);
    }
    public static void sum(int num1, int num2){
        int adding = num1 + num2;
        System.out.println("The sum of two Numbers are : " + adding);
    }


}
