package java_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개 입력");
        int sum = 0, n = 0;

        for (int i = 0; i < 3; i++) {
            try {
                n = scanner.nextInt(); //정수입력
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다.");
                scanner.next();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("sum = " + sum);
        scanner.close();

    }
}