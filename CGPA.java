//Calculate CGPA Java Program


import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Total Grade Point Earned in a Program :");
        float total_marks = input.nextInt();
        System.out.println("Enter Total Credit Hours for GPA  :");
        float credit_hours = input.nextInt();

        float cgpa = ( total_marks / credit_hours);
        System.out.println("The total CGPA of the program is :" + cgpa);

    }
}
