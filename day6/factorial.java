// package day6;

public class factorial {
    public int fact(int n ){
        if (n == 1 || n == 0) {
            return 1;
        }
        else{
            return n * fact(n-1);
        }

    }
    public static void main(String[] args) {
        factorial checking = new factorial();
        int n = 5;
        System.out.println(checking.fact(n));
    }
}
