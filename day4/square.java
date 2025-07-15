public class square {
    public static void main(String[] args) {
        int num =36;
        //a^2+2ab+b^2
        int bSquare = num%10;
        bSquare = bSquare*bSquare;
        int aSquare= num/10;
        int ab2 =  2*(aSquare)*(num%10);//2ab
        aSquare = aSquare*aSquare;
        if (bSquare>9) {
            int m = bSquare/10;
            ab2 = ab2 + m;
            bSquare = bSquare%10;
            if (ab2>9) {
            int n = ab2/10;
            aSquare = aSquare+ n;
            ab2 = ab2%10;
        }
        }
        else if (ab2>9) {
            int n = ab2/10;
            aSquare = aSquare+ n;
            ab2 = ab2%10;
        }
        System.out.println("The square of "+ num + " is:" + aSquare + ab2+bSquare);
    }
}
