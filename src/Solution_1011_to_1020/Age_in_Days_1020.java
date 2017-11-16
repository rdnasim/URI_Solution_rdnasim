package Solution_1011_to_1020;


import java.util.Scanner;

public class Age_in_Days_1020 {


    public static void main(String[] args) {
        int age_days;

        Scanner sc = new Scanner(System.in);
        age_days = sc.nextInt();

        int years = age_days / 365;
        int rA = age_days % 365;
        int rM = rA % 30;
        int months = rA / 30;
        int days = rM % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);

    }

}
