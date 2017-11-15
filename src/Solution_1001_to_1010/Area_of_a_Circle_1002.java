package Solution_1001_to_1010;

import java.util.Scanner;

public class Area_of_a_Circle_1002 {

    public static void main(String[] args) {

        double R, A;

        Scanner sc = new Scanner(System.in);

        R = sc.nextDouble();
        A = 3.14159 * R * R;

        System.out.printf("A=%.4f\n", A);
    }
}
