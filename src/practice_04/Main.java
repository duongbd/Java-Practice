package practice_04;

import java.util.Scanner;

public class Main {
    public static boolean checkPytagoRule(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        if (a == max) {
            return (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2));
        }
        if (b == max) {
            return (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2));
        }
        return (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2));
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (a > 0 && b > 0 && c > 0) {
                System.out.println(checkPytagoRule(a, b, c));
            } else {
                System.out.println("Cac canh cua tam giac phai > 0");
            }
        } catch (Exception e) {
            System.out.println("It's not an integers");
        }
    }
}
