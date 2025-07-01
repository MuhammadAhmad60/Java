//Calculate Batting Average

public class Batting_Average {
    public static void main(String[] args) {
        int [] score = {32,78,95,66,54,10,2};
        double sum = 0;


        for (int i = 0; i < score.length; i ++){
            sum += score[i];
        }
        double batting_average = sum / score.length;
        System.out.println("The batting Average is :" + batting_average);

    }
}
