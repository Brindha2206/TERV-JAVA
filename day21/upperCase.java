package day21;

import java.util.Scanner;

public class upperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        System.out.println((char)(a^32));
        System.out.println((char)(b^32));
        sc.close();
    }
}
