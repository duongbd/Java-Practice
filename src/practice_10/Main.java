package practice_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                String idStudent = scanner.next();
                if (idStudent.matches("B170[1-9]{4}")) {
                    System.out.println(idStudent + " is match");
                } else System.out.println(idStudent + " isn't match");
            }
    }
}
