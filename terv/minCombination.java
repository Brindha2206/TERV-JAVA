import java.util.*;
public class minCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,6,24,120,720,5040};
        int n = sc.nextInt();
        // int ans = 0;
        // for(int i = arr.length-1; arr[i]>=n;i--){
        //    ans = ans + arr[i-1];
        // }
        // System.out.println(ans);
        
        // for(int i = arr.length-1;i>=0;){
        //     if(n<arr[i]){
        //         i--;
        //     }
        //     else{
        //         while (n>=arr[i]) {
        //             System.out.print(i+ " ");
        //             n = n-arr[i];
        //         }
        //         if (n==0) {
        //             break;
        //         }
        //     }
        // }

        ////gaytahri method
        for(int i=arr.length-1;i>=0;i--) {
				if(arr[i]<=n) {
					int val=arr[i];
					int cnt=n/val;
					while(cnt>0) {
						System.out.print(i+" ");
                        cnt --;
					}
					n=n%arr[i];	
				}
    }
}
}
