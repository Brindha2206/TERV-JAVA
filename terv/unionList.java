import java.util.*;
public class unionList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for(int i = 0; i<n;i++){
            list1.add(sc.nextInt());
        }
        for(int i = 0; i<m;i++){
            list2.add(sc.nextInt());
        }
        Set<Integer> unionList = new HashSet<>();
        unionList.addAll(list1);
        unionList.addAll(list2);
        Iterator<Integer> i = unionList.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }
    }
}
