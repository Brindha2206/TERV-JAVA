package day26;

import java.util.Scanner;

public class carRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCars = sc.nextInt();
        int count = 0;
        int answer = 0;
        int[] cars = new int[totalCars];
        for(int i = 0; i< totalCars;i++){
            cars[i] = sc.nextInt();
        }
        for(int i = 0;i<totalCars;i++){
            count = 0;
            for(int j = i+1;j<totalCars;j++){
                if (cars[i]==cars[j]) {
                    count++;
                }
            }
            if (count==0) {
                answer++;
        }
        }
        System.out.println(answer);
    }
}
