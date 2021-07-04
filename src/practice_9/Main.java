package practice_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_VALUE_OF_N = 275;
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            if (number == 0 || number == 1) System.out.println(number);
            if (number >= 2 && number <= MAX_VALUE_OF_N) {
                int fBehind = 0;
                int fAfter = 1;
                int result = 0;
                for (int i = 2; i <= number; i++) {
                    result = fBehind + fAfter;
                    fBehind = fAfter;
                    fAfter = result;
                }
                System.out.println(result);
            } else {
                System.out.println("Out of range");
            }
        } catch (InputMismatchException exception) {
            System.out.println("It's not an integers");
        }
    }
}
