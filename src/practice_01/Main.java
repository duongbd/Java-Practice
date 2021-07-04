package practice_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            String string= (number>=0) ?"This is positive integers":"This is negative integers";
            System.out.println(string);
        }catch (Exception e){
            System.out.println("It's not an integers");
        }
    }
}
