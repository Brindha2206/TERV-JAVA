public class josephusProblem {
    public static void main(String[] args) {
        int n = 5;
        int startingPoint = 3;
        int binary = 1;
        for (; binary <= n; binary<<=1);
        binary>>=1;
        int d = n - binary;
        int ans = (2*d+ startingPoint)%n;
        System.out.println((ans==0)?n:ans);
    }
}
