package day10;

import java.util.Scanner;

public class amicable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum_a = 0;
        int sum_b = 0;
        for(int i = 1;i<a ; i++){
            if((a%i)==0){
                sum_a = sum_b + i;
            }
        }
        for(int i = 1; i<b;i++){
            if((b%i)==0){
                sum_b = sum_b + i;
            }
        }
        if((sum_a==b)||(sum_b==a)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}