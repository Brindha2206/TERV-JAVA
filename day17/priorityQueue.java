package day17;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(a>b?1:-1));
        pq.add(8);
        pq.add(7);
        System.out.println(pq);
    }
}
