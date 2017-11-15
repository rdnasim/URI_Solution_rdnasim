package Solution_1001_to_1010;

import java.util.Scanner;

public class Simple_Calculate_1010 {

    public static void main(String[] args){

        int product_1_code, product_1_no_unit, product_2_code, product_2_no_unit ;
        double product_1_price, product_2_price, total;

        Scanner scanner = new Scanner(System.in);

        product_1_code = scanner.nextInt();
        product_1_no_unit = scanner.nextInt();
        product_1_price = scanner.nextDouble();

        total = product_1_no_unit * product_1_price;

        product_2_code = scanner.nextInt();
        product_2_no_unit = scanner.nextInt();
        product_2_price = scanner.nextDouble();

        total += product_2_no_unit * product_2_price;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);


    }
}
