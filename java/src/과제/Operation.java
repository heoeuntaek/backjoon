package 과제;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = 0; // 첫번째 숫자
        double second = 0; //   두번째 숫자
        String operator; // 연산자

        try { // 연산자 입력
            while (true) {


                first = scanner.nextDouble(); // 첫번째 숫자 입력
                operator = scanner.next(); // 연산자 입력
                second = scanner.nextDouble(); // 두번째 숫자 입력
                if (operator.equals("=")) break; //    % 연산을 위한 조건문
                System.out.println("결과 : " + Math.round(calculate(first, second, operator))); // 결과 출력
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다."); // 잘못된 입력시 출력
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다."); // 0으로 나눌 수 없을 때 예외처리

        }
    }

    private static double calculate(double first, double second, String operator) {
        double a = first;
        double b = second;
        if (operator.equals("+")) { // + 연산
            double result = a + b;
            return result;
        } else if (operator.equals("-")) { // - 연산
            double result = a - b;
            return result;
        } else if (operator.equals("*")) { // * 연산
            double result = a * b;
            return result;
        } else if (operator.equals("/")) { // / 연산
            double result = a / b;
            return result;
        } else if (operator.equals("%")) { // % 연산
            double result = a % b;
            return result;
        } else {
            return 0; //
        }
    }
}