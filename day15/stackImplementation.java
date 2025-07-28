package day15;

// import java.util.Stack;

class Stack{
    class Node{
        int data;
        Node next;

        Node(int value){
            data = value;
            next = null;
        }
    }
    Node top;
        public Stack(){
            top = null;
        }
    
}

public class stackImplementation {
    public static void main(String[] args) {
        Stack s = new Stack();
    }
}
