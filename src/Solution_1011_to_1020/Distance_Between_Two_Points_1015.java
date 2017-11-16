package Solution_1011_to_1020;


import java.util.Scanner;

public class Distance_Between_Two_Points_1015 {

    public static void main(String[] args) {

        double x1, y1, x2, y2, dist;

        Scanner scanner = new Scanner(System.in);

        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f", dist);
    }

}
