//K.Brindha[22cs058]
// 45. Print characters without repeating: a b c d e f g h
import java.util.Arrays;
import java.util.Scanner;
public class withoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size = sc.nextInt();
		char a[]=new char[size];
		int[] count=new int[26];
		System.out.println("Enter your characters:");
		for(int i=0;i<a.length;i++){
			System.out.println("enter the "+i+" char:");
			a[i]=sc.next().charAt(0);
		}
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            count[a[i]-'a']++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]>0) {
                System.out.print((char)(i+97)+",");
            }
        }
    }
}
