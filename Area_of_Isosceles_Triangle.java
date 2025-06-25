
//Area Of Isosceles Triangle

import java.util.Scanner;

public class Area_of_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Area;
        System.out.print("Enter the value of base : ");
        int base = input.nextInt();
        System.out.print("Enter the value of height : ");
        int height = input.nextInt();


        Area = (float) 1/2 * (base * height );
        System.out.println("Area of Isosceles Triangle   : " + Area);



    }


}
