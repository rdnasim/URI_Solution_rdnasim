package Solution_1011_to_1020;


import java.util.Scanner;

public class Distance_1016 {

    public static void main(String[] args) {

        int d;

        Scanner scanner = new Scanner(System.in);

        d = scanner.nextInt();

        int t = (int) (d / ((90 / 60.0) - (60 / 60.0)));

        System.out.printf("%d minutos", t);
    }
}
