package Solution_1011_to_1020;


import java.util.Scanner;

public class Fuel_Spent_1017 {

    public static void main(String[] args) {

        double a, b, r;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        r = (a * b) / 12;

        System.out.printf("%.3f\n", r);

    }
}
