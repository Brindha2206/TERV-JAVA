public class multiple11 {
    public static void main(String[] args) {
       int num = 129;
        int firstDigit ,middle, lastDigit;
        firstDigit = num/10;
        firstDigit = firstDigit/10;
         lastDigit = num%10;
         middle = num/10;
        middle = middle%10;  
        int sum1 = lastDigit + middle;  
        if (sum1>9) {
            int n =
            sum1 = sum1%10;
        }
        int sum2 = middle + firstDigit;
        // System.out.printf("%d%d%d%d",firstDigit,sum2,sum1,lastDigit);
    }
}
