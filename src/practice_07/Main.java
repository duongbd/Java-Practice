package practice_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            for (int i=1;i<=20;i++){
                System.out.println(number+" x "+i+" = "+number*i);
            }
        } catch (InputMismatchException exception) {
            System.out.println("It's not an integers");
        }
    }
}
