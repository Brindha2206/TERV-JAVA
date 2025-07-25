package day13;
import java.util.Scanner;
class duplicateValues {
    public void removeDuplicates(int[] num) {
          Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0 ; i<size;i++){
            nums[i] = sc.nextInt();
        }
        int k = 0 ;
        for(int j = 0; j<size ; j++){
            for( int i = j+1 ; j<size ; j++){
                if(nums[j]==nums[i]){
                    k ++;
                }
                else{
                    System.out.print(nums[i]+ " ");
                }
            }
        }
    }
}