// Calculate Average Marks

public class Average_Marks {
    public static void main(String[] args) {
        int [] marks = {50, 70, 65, 45, 55, 66, 77, 88, 99, 44, 43};
        double sum = 0;

        for (int i = 0; i < marks.length; i++){
            sum += marks.length;
        }
        double Average_marks = sum / marks.length;
        System.out.println("The Average Marks of your numbers is :" + Average_marks);
    }
}
