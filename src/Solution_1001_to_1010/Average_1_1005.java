package Solution_1001_to_1010;

import java.util.Scanner;

public class Average_1_1005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();


        double MEDIA = (A * 3.5 + B * 7.5) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
