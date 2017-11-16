package Solution_1011_to_1020;


import java.util.Scanner;

public class Banknotes_1018 {

    public static void main(String[] args) {

        int notes, possNo;

        Scanner scanner = new Scanner(System.in);

        notes = scanner.nextInt();

        System.out.printf("%d\n", notes);
        System.out.printf("%d nota(s) de R$ 100,00\n", notes / 100);

        possNo = (notes % 100);

        System.out.printf("%d nota(s) de R$ 50,00\n", possNo / 50);
        possNo = (possNo % 50);

        System.out.printf("%d nota(s) de R$ 20,00\n", possNo / 20);
        possNo = (possNo % 20);

        System.out.printf("%d nota(s) de R$ 10,00\n", possNo / 10);
        possNo = (possNo % 10);

        System.out.printf("%d nota(s) de R$ 5,00\n", possNo / 5);
        possNo = (possNo % 5);

        System.out.printf("%d nota(s) de R$ 2,00\n", possNo / 2);
        possNo = (possNo % 2);

        System.out.printf("%d nota(s) de R$ 1,00\n", possNo / 1);

    }
}
