package practice_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float average = 0;
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
                    float value = scanner.nextInt();
                    average += (value / des);
                    count++;
                    if (count == des) inputDone = true;
                } catch (InputMismatchException exception) {
                    System.out.println("Re enter, must is integer");
                }
            }
        }
        System.out.println("Average is: " + average);
    }
}
