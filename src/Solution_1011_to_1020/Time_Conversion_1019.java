package Solution_1011_to_1020;


import java.util.Scanner;

public class Time_Conversion_1019 {

    public static void main(String[] args) {
        int t;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        int h = t / 3600;
        t = t - (h * 3600);

        int m = t / 60;
        t = t - (m * 60);

        System.out.printf("%d:%d:%d\n", h, m, t);

    }

}

