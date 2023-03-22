package 과제2;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        //문자열 입력
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("입력)"); //입력문자열
            String string = sc.next();
            int i = sc.nextInt();


            int count = 0;
            if (i > 0) { //입력값이 0보다 크면
                do {
                    string = string.substring(i) + string.substring(0, i); //문자열을 i만큼 오른쪽으로 이동
                    System.out.println(string);
                    count++;
                }
                while (count < string.length() / i);  // 문자열의 길이를 i로 나누어서 입력값이 될 때까지 반복
            } else if (i < 0) {
                do {
                    string = string.substring(string.length() + i) + string.substring(0, string.length() + i); //문자열을 i만큼 왼쪽으로 이동
                    System.out.println(string);
                    count++;
                }
                while (count < string.length() / Math.abs(i));
            } else if (i == 0) {
                System.out.println("종료함");
                return;
            }
        }

    }
}