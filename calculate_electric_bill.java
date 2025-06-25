// Calculate Electricity Bill

import java.util.Scanner;

public class calculate_electric_bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total units of this month ");
        int units = input.nextInt();
        double total_bill = 0;

        if (units <= 100){
            total_bill = (units * 24);
        } else if (units <= 200) {
            total_bill = (units * 35);
        } else if (units < 300) {
            total_bill = (units * 39);
        } else if (units > 300) {
            total_bill = (units * 40);
        }
        System.out.println("Electricity bill rs: " + total_bill);
    }
}

