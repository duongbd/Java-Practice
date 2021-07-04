package practice_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            if (number > 0) {
                int sum = 0;
                for (int i = 0; i <= number; i += 2) {
                    sum += i;
                }
                System.out.println("Sum= " + sum);
            } else
                System.out.println("Integer must >=0");
        } catch (InputMismatchException exception) {
            System.out.println("It's not an integers");
        }
    }
}
