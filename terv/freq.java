import java.util.*;
public class freq {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String input1 = "apple";
        String input2 = "orange";
        String answer = input1 + input2;
        int size = answer.length();
        int[] count = new int[26];
        Character[] charArray = new Character[size];
        for(int i = 0 ; i< size;i++){
            charArray[i]=answer.charAt(i);
        }
        Arrays.sort(charArray, Collections.reverseOrder());
        System.out.println(charArray);
        // for(int i = 0;i<size;i++){
        //     count[charArray[i]-'a']++;
        // }
        // for(int i=0;i<count.length-1;i++){
        //     if(count[i]>0){
        //         System.out.print((char)(i+97));
        //     }
        // }
      
    }
}
