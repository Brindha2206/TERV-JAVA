package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class union2List {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for(int i = 0;i<size1;i++){
            list1.add(sc.nextInt());
        }
        for(int i = 0 ; i<size2;i++){
            list2.add(sc.nextInt());
        }
        list3.addAll(list1);
        list3.addAll(list2);
        Iterator<Integer> i = list3.iterator();
        Collections.sort(list3);
        System.out.println(list3);
    }
}
