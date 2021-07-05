package practice_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        String subString=scanner.next();
        if (subString.length()==1){
            if (string.contains(subString)){
                System.out.println("Yes");
            }else System.out.println("No");
        }
        else System.out.println("Second input must a char");
    }
}
