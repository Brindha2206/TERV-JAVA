package day16;
import java.util.*;
import java.util.Iterator;
public class linkedListCollectionsProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> List = new LinkedList<Integer>();
        for(int i = 0;;i++){
            int a = sc.nextInt();
            if(a==-1){
                break;
            }
            List.add(a);
        }
        System.out.println(List);
        
        Iterator<Integer> i = List.iterator();
        while (i.hasNext()) {
            // int odd = i.hasNext();
            int odd = i.next();
            if ((odd%2)!=0) {
                System.out.print(odd + " ");
            }
            // if((odd%2)==0){
            //     List.remove(odd);
            //     System.out.println(List);
            // }

        }
       
    }
}
