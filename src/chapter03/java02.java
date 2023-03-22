package chapter03;

import java.util.Scanner;

public class java02 {
    public static void main(String[] args) {
        int num1;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        if (0 < num1 && num1 < 6) {
            System.out.println("少年");
        } else if (num1 >= 6 && num1 <= 40) {
            System.out.println("青年");
        } else {
            System.out.println("老年");
        }
    }
}
