package practice_19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        int count = 0;
        while (stringBuilder.toString().contains("a")) {
            count++;
            stringBuilder.deleteCharAt(stringBuilder.toString().indexOf("a"));
        }
        System.out.println(count);
    }
}
