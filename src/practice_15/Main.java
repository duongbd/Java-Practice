package practice_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.next());
        }
        boolean isAllTrue = true;
        for (String s : arrayList) {
            if (!s.matches("00[2-5]L[\\d]{4}")) {
                isAllTrue = false;
                break;
            }
        }
        System.out.println(isAllTrue);
    }
}
