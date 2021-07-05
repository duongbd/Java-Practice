package practice_20;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String idStudent = scanner.nextLine();
            if (idStudent.matches("[A-Z][^\\s]{0,18}[\\d]"))
                System.out.println("Accept");
            else System.out.println("Not Accept");
        }
}
