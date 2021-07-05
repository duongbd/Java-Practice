package practice_14;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int des = 0;
        int count = 0;
        boolean inputDone = false;
        boolean getDes = false;
        while (!inputDone) {
            Scanner scanner = new Scanner(System.in);
            if (!getDes) {
                try {
                    des = scanner.nextInt();
                    if (des > 0) {
                        getDes = true;
                    } else System.out.println("Must > 0");
                } catch (InputMismatchException exception) {
                    System.out.println("Re enter, must is integer");
                }
            } else {
                try {
                    int value = scanner.nextInt();
                    stack.push(value);
                    count++;
                    if (count == des) inputDone = true;
                } catch (InputMismatchException exception) {
                    System.out.println("Re enter, must is integer");
                }
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
