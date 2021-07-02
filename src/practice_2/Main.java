package practice_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String convertUnitToString(int value, int index, ArrayList<Integer> arrayList) {
        String str = "";
        switch (value) {
            case (0):
                if ((arrayList.size() == 1 && index == 0) || (index - 2) % 3 == 0) {
                    str = "khong";
                }
                if (index >= 1) {
                    if ((index - 1) % 3 == 0 && arrayList.get(index - 1) == 0) {
                        return "";
                    }
                    if ((index - 1) % 3 == 0) {
                        return " linh ";
                    }
                }
                break;
            case (1):
                str += ((index - 1) % 3 != 0) ? "mot" : str;
                break;
            case (2):
                str += ("hai");
                break;
            case (3):
                str += ("ba");
                break;
            case (4):
                str += ("bon");
                break;
            case (5):
                str += ("nam");
                break;
            case (6):
                str += ("sau");
                break;
            case (7):
                str += ("bay");
                break;
            case (8):
                str += ("tam");
                break;
            case (9):
                str += ("chin");
                break;
        }

        if (index == 0) {
            return str;
        }
        if ((index - 1) % 3 == 0) {
            return str + " muoi ";
        }
        if ((index - 2) % 3 == 0) {
            return str + " tram ";
        }
        if (index == 3) {
            return str + " nghin ";
        }
        if (index == 6) {
            return str + " trieu ";
        }
        if (index == 9) {
            return str + " ty ";
        }
        return "none of above";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            if (number < 0) {
                number *= -1;
                System.out.print("Am ");
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (number >= 10) {
                int tg = number % 10;
                number /= 10;
                arrayList.add(tg);
            }
            arrayList.add(number);
            StringBuilder result = new StringBuilder();
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                result.append(convertUnitToString(arrayList.get(i), i, arrayList));
            }
            String s = result.toString().replaceAll("\\s+", " ").trim();
            System.out.println(s);

        } catch (Exception e) {
            System.out.println("It's not an integer");
        }
    }
}
