package Solution_1001_to_1010;

import java.util.Scanner;
public class Salary_1008 {
    public static void main(String[] args){

        int NUMBER,hours;
        float amount,SALARY;
        Scanner sc = new Scanner(System.in);

        NUMBER = sc.nextInt();
        hours = sc.nextInt();
        amount = sc.nextFloat();
        SALARY = hours * amount;

        System.out.printf("NUMBER = %d\n",NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);

    }
}
