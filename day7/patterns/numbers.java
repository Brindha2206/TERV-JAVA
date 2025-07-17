package day7.patterns;

public class numbers {
    public static void main(String[] args) {
        int n =5;
        int m =n/2 +1;
        //ZERO
        System.out.println("-----------ZERO-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         //ONE
        System.out.println("-----------ONE-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if ( i == n || j == m || ((i==1)&&(j<=m))) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //TWO
        System.out.println("-----------TWO-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if ( i == 1 || i == n||i == m || ((j == n)&&(i<=m))|| ((j==1)&&(i>=m))) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //THREE
        System.out.println("-----------THREE-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if ( i == 1 || i == n||i == m || j==n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //FOUR
        System.out.println("-----------FOUR-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if (( i == (n-1)||((j == 1)&&(i!=n)) || j == m )){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         //FIVE
        System.out.println("-----------FIVE-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if (( i == 1|| (j== 1)&&(i<=m) ||i==n|| i == m || (j == n)&&(i>=m))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //SIX
        System.out.println("-----------SIX-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if (( i == n|| j == 1||i==n|| i == m || (j==n)&&(i>=m))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         //SEVEN
        System.out.println("-----------SEVEN-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if (( i == 1|| i == k||i==m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //EIGHT
        System.out.println("-----------EIGHT-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if (( i == 1|| i == n||i==m||j==1||j==n)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         //NINE
        System.out.println("-----------NINE-----------");
        for(int i = 1; i<=n;i++){
            for(int j = 1, k = n; j<=n; j++,k--){
                if (( i == 1||i==m||(j==1)&&(i<=m)||j==n)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
