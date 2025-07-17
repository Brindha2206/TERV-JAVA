package day7.patterns;

public class alphabets {
    public static void main(String[] args) {
        int n = 5;
        int m = (n / 2) + 1;
        // System.out.println("----------BRINDHA----------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == m || i == n || (j == 1 && i >= m) || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == m || (j == n && i <= m)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == m || i == n || i == 1 || j == n||j==1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == m || j == n ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
