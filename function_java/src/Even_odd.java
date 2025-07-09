import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
        System.out.println(even_odd(num));
    }
    public static int even_odd(int num){
        if (num % 2 == 0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("The number is Odd");
        }
        return num;
    }
}
