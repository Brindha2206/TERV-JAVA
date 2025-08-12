package day21;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int original = N;
        int temp = N;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int result = 0;
        temp = N;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            result += power;
            temp /= 10;
        }

        if (result == original) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}