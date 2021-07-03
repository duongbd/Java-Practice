package practice_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (a > 0 && b > 0 && c > 0) {
                boolean ab = (a + b) > c;
                boolean bc = (b + c) > a;
                boolean ca = (c + a) > b;
                System.out.println(ab && bc && ca);
            } else {
                System.out.println("Cac canh cua tam giac phai > 0");
            }
        } catch (Exception e) {
            System.out.println("It's not an integers");
        }
    }
}
