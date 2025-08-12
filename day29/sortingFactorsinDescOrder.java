package day29;
import java.util.*;
public class sortingFactorsinDescOrder {
    
         public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> factors = new ArrayList<>();
        for(int f : arr){
        for(int i =1;i<arr[f];i++){
            if(n%1==0){
                factors.add(i);
            }
        }
    }
      Collections.sort(factors, Collections.reverseOrder());
      for(int i : factors){
        System.out.print(i + " ");
      }
    }
}