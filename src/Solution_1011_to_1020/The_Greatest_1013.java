package Solution_1011_to_1020;

import java.util.Scanner;

public class The_Greatest_1013 {
    public static void main(String[] args){

        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a>b & a>c){
            System.out.printf("%d eh o maior\n", a);
        }
        else if (b>a & b>c){
            System.out.printf("%d eh o maior\n", b);
        }

        else
            System.out.printf("%d eh o maior\n", c);

    }
}
