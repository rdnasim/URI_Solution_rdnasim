package Solution_1001_to_1010;

import java.util.Scanner;

public class Average_2_1006 {
    public static void main(String[] args) {

        double a, b, c, med;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        med = (a / 10 * 2) + (b / 10 * 3) + (c / 10 * 5);

        String media = String.format("MEDIA = %,.1f", med);
        System.out.print(media + "\n");
    }
}