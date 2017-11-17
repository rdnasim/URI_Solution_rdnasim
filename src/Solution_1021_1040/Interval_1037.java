package Solution_1021_1040;


import java.util.Scanner;

public class Interval_1037 {

    public static void main(String[] args) {

        float number;

        Scanner scanner = new Scanner(System.in);

        number = scanner.nextFloat();

        if (number >= 0 && number <= 25.0000) {
            System.out.printf("Intervalo [0,25]\n");
        } else if (number >= 25.00001 && number <= 50.0000000) {
            System.out.printf("Intervalo (25,50]\n");
        } else if (number >= 50.00001 && number <= 75.0000000) {
            System.out.printf("Intervalo (50,75]\n");
        } else if (number >= 75.00001 && number <= 100.0000000) {
            System.out.printf("Intervalo (75,100]\n");
        } else
            System.out.printf("Fora de intervalo\n");

    }
}
