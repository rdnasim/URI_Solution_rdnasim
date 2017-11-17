package Solution_1021_1040;

import java.util.Scanner;

public class Selection_Test_1_1035 {

    public static void main(String[] args) {

        int A, B, C, D;

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {

            System.out.printf("Valores aceitos\n");
        } else
            System.out.printf("Valores nao aceitos\n");
    }

}
