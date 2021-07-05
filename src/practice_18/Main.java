package practice_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.matches(".*[\\d]+.*"))
            System.out.println("Yes");
        else System.out.println("No");
    }
}
