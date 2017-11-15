package Solution_1001_to_1010;

import java.util.Scanner;

public class Difference_1007 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c, d, difference;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        difference = a * b - c * d;

        System.out.print("DIFERENCA = " + difference + "\n");

    }
}
