//Calculate Distance Between Two Points

public class distance_between_points {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 4;
        int y1 = 2;
        int y2 = 5;
        double distance;


        double difference_x = (x2 - x1);
        double difference_y = (y2 - y1);

        // squared of y and x

        double square_x = difference_x * difference_x;
        double square_y = difference_y * difference_y;

        // adding both x, y
        double adding_x = square_x + square_y;

        distance  = Math.sqrt(adding_x);
        System.out.println("The distance between two points are :" +  distance);





    }
}
