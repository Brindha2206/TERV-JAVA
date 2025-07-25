package day10;

import java.util.Scanner;

public class decimal2Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result  =new int[32];
        int n = sc.nextInt();
        int i =0;
        for(;n>0;n>>=1){
            result[i] = n&1;
        }
        System.out.println(result);s
    }
}
