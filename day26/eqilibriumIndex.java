package day26;

import java.util.Scanner;

public class eqilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i =0;i<n;i++){
            input[i]=sc.nextInt();
        }
        int leftSum = 0;
        int rightSum = 0;
        int i;
        for(i = 0;i<n;){
            if(i!=0){
                leftSum=0;
                for(int l = i-1;l>=0;l--){
                    leftSum = leftSum + input[l];
                }
            }
            rightSum=0;
            for(int r = i+1; r<n;r++){
                rightSum = rightSum + input[r];
            }
            if (leftSum==rightSum) {
                break;
            }
            else i++;
        }
        System.out.println(i);
    }
}
//testcase 1: 22 7 16 6
//testcase 2: 10 5 2 44 1 2 14