package Solution_1001_to_1010;

import java.util.Scanner;

public class Salary_with_Bonus_1009 {

    public static void main(String[] args){

        double salary = 0, value, total;
        String name;

        Scanner scanner = new Scanner(System.in);

        name = scanner.next();
        salary = scanner.nextDouble();
        value = scanner.nextDouble();

        total = salary + value * .15 ;

        System.out.printf("TOTAL = R$ %.2f", total);
    }
}
