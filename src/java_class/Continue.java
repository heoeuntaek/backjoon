package java_class;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        int a;
        int sum =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력하세요");

        for (int i = 0; i < 5; i++) {
            a=scanner.nextInt();
            if (a <= 0) {
                continue;
            } else {
                sum+=a;
            }
        }
        System.out.println("sum = " + sum);
    }
}