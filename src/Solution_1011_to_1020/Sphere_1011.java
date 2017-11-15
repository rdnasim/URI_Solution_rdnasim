package Solution_1011_to_1020;

import java.util.Scanner;

public class Sphere_1011 {
    public static void main(String[] args) {

        double R, volume;

        Scanner scanner = new Scanner(System.in);

        R = scanner.nextInt();

        volume = (4.0 / 3) * 3.14159 * R * R * R;

        System.out.printf("VOLUME = %.3f\n", volume);

    }
}
