package practice_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String subString = scanner.next();
        if (subString.length() == 1) {
            if (string.contains(subString)) {
                System.out.println(string.indexOf(subString));
            } else System.out.println("Doesn't exist in string");
        } else System.out.println("Second input must a char");
    }
}
