package 과제;

import java.util.Scanner;

public class Fraction {

    int numerator; //분자 필드
    int denominator;   //분모 필드

    public Fraction() {   // 분자와 분모를 1로 지정하는 생성자
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction(int d) {  // 분자는 1로 지정, 분모는 d로 지정하는 생성자
        this.numerator = 1;
        this.denominator = d;
    }

    public Fraction(int n, int d) {  //분자는 n, 분모는 d로 지정하는 생성자
        this.numerator = n;
        this.denominator = d;
    }

    private Fraction addFraction(Fraction first, Fraction second) {  //두 Fraction 객체를 더하는 메소드
        int up = first.numerator * second.denominator + second.numerator * first.denominator; //분자를 계산
        int down = first.denominator * second.denominator; //분모를 계산
        Fraction result = new Fraction(up, down); //두 Fraction 객체를 더한 결과를 반환
        return result; //Fraction 객체 반환
    }

    private Fraction subFraction(Fraction first, Fraction second) {
        int up = first.numerator * second.denominator - second.numerator * first.denominator;
        int down = first.denominator * second.denominator;
        Fraction result = new Fraction(up, down);
        return result;
    }

    private Fraction mulFraction(Fraction first, Fraction second) {
        int up = first.numerator * second.numerator;
        int down = first.denominator * second.denominator;
        Fraction result = new Fraction(up, down);
        return result;
    }

    private Fraction divFraction(Fraction first, Fraction second) {
        int up = first.numerator * second.denominator;
        int down = first.denominator * second.numerator;
        Fraction result = new Fraction(up, down);
        return result;
    }

    public void printFraction(Fraction first, Fraction second, Fraction result, String operator) {
        System.out.println(first.numerator + "/" + first.denominator + operator + second.numerator + "/" + second.denominator + " = " + result.numerator + "/" + result.denominator);
    }

    public Fraction abbreviation(Fraction result) {
        int up = result.numerator;
        int down = result.denominator;


        for (int i = 2; i <= up; i++) {
            while (true) {
                if ((up % i == 0) && (down % i == 0)) {
                    up /= i;
                    down /= i;
                } else {
                    break;
                }
            }
        }
        Fraction changed = new Fraction(up, down);
        return changed;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("분수1(분자 분모) 입력 : ");
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();

        System.out.print("분수2(분자 분모) 입력 : ");
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();

        System.out.println();

        Fraction first = new Fraction(numerator1, denominator1);
        Fraction second = new Fraction(numerator2, denominator2);
        Fraction result = new Fraction();
        String operator;


        operator = "+";
        result = result.addFraction(first, second);
        result = result.abbreviation(result);
        result.printFraction(first, second, result, operator);

        operator = "-";
        result = result.subFraction(first, second);
        result = result.abbreviation(result);
        result.printFraction(first, second, result, operator);

        operator = "*";
        result = result.mulFraction(first, second);
        result = result.abbreviation(result);
        result.printFraction(first, second, result, operator);

        operator = "/";
        result = result.divFraction(first, second);
        result = result.abbreviation(result);
        result.printFraction(first, second, result, operator);

    }


}