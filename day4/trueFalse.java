public class trueFalse {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,0,1,1,1,0,0,0,0,0,0,0,1};
        int count = 0;
        // int count_1 =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                count++;
            }
            else{
                count--;
            }
        }
        if (count>0) {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
      
        
    }
}
