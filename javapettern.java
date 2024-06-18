
import java.util.Scanner;

public class javapettern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || j == 1) || (j == 5 || i == 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int fg = 4 - 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= fg; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(" * ");
            }
            System.out.println();
            fg--;
        }
        int z = 1;
        int x = 3;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= z; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= x; l++) {
                System.out.print(" * ");
            }
            System.out.println();
            z++;
            x--;
        }
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        int h = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= h; k++) {
                System.out.print("*");
            }
            System.out.println();
            h++;
        }
        int n = 1;
        for (int i = 5; i >= 1; i--) {
            for (int k = 1; k < n; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            n++;
        }
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
            n--;
        }
        int n = 1;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k < 5; k++) {
                System.out.print(k + " ");
            }
            n++;
            System.out.println();
        }
        int m = 3;
        int g = 2;
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= g; j++) {
                System.out.print(" ");
            }
            for (int k = m; k < 5; k++) {
                System.out.print(k + " ");
            }
            m--;
            System.out.println();
            g--;
        }
        int g = 2;
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= g; j++) {
                System.out.print(" ");
            }
            for (int k = m; k < 5; k++) {
                System.out.print(k + " ");
            }
            m--;
            System.out.println();
            g--;
        }
        int g = 2;
        int l = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= l; k++) {
                if (k == 1 || k == l || i == 1 || i == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            l++;
        }
        int l = 1;
        int t = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= t; k++) {
                if (k == 1 || k == t || i == 1 || i == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            t--;
        }

        int g = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= g; k++) {
                if (k == 1 || k == g || i == 1 || i == 4) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
            g--;
        }

        int t = 2;
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= t; k++) {
                if (k == 1 || k == t || i == 1 || i == 4) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
            t++;
        }

    }
}
