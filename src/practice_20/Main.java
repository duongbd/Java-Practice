package practice_20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String idStudent = scanner.next("[A-Z][^' ]{0,18}[\\d]");
            System.out.println("Accept");
        } catch (InputMismatchException e) {
            System.out.println("Not accept");
        }
    }
}
