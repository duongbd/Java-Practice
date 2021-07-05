package practice_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int des = 0;
        int count = 0;
        boolean inputDone = false;
        boolean getDes = false;
        while (!inputDone) {
            Scanner scanner = new Scanner(System.in);
            if (!getDes) {
                try {
                    des = scanner.nextInt();
                    if (des > 0) {
                        getDes = true;
                    } else System.out.println("Must > 0");
                } catch (InputMismatchException exception) {
                    System.out.println("Re enter, must is integer");
                }
            } else {
                try {
                    int value = scanner.nextInt();
                        min = Math.min(min, value);
                        count++;
                    if (count == des) inputDone = true;
                } catch (InputMismatchException exception) {
                    System.out.println("Re enter, must is integer");
                }
            }
        }
        System.out.println("Min of list is: " + min);
    }
}
