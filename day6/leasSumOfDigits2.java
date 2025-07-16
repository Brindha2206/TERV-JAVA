
//least time complexity
public class leasSumOfDigits2 {
    public static void main(String[] args) {
        int num = 45;
        System.out.print((num%9)==0?"":num%9);
        for (int q = num/9; q>0; q--) {
            System.out.print(9);
        }
    }
}
