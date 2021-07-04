package practice_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String idStudent = scanner.next("B[1-9]{7}");
            System.out.println(idStudent + " is match");
        } catch (InputMismatchException e) {
            System.out.println("Not match");
        }
    }
}
