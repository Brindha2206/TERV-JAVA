package day13;

import java.util.Arrays;
import java.util.Scanner;

public class mixedSorting {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int mid = n/2;
         for(int i = 0 ;i<mid;i++ ){
            int min = arr[0];
            if(min>arr[0+i]){
                min = arr[0+i];
            }
            System.out.print(min + " ");
        }
        for(int j = arr.length-1; j>=mid ; j--){
            System.out.print(arr[j] + " ");
        }
        // System.out.println(Arrays.toString(arr));
    }
}