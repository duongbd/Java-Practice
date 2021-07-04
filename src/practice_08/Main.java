package practice_08;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean isNaturalNumber(int number, ArrayList<Integer> arrayList) {
        for (int i = 0; arrayList.get(i) <= (number / 2); i++) {
            if (number % arrayList.get(i) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            if (number > 1000) System.out.print("number must < or = 1000");
            else if (number < 0) System.out.print("number must > 0");
            else if (number > 1) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(2);
                for (int i = 3; i < number; i++) {
                    if (isNaturalNumber(i, arrayList)) {
                        arrayList.add(i);
                    }
                }
                System.out.println("Natural number 0 - " + number + " is:");
                System.out.print("0, 1");
                for (int value : arrayList) {
                    System.out.print(", " + value);
                }
            } else if (number == 0) {
                System.out.println("Natural number 0 - " + number + " is:");
                System.out.print("0");
            } else {
                System.out.println("Natural number 0 - " + number + " is:");
                System.out.print("0, 1");
            }
        } catch (InputMismatchException exception) {
            System.out.println("It's not an integers");
        }
    }
}
