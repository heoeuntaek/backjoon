package java_class;

import java.util.Scanner;

public class 시간 {
    public static void main(String[] args) {
        int 시간;
        int 초;
        int 분;
        int 시;

        Scanner scanner = new Scanner(System.in);
        System.out.println("java수업.시간 입력하세요");
        시간 = scanner.nextInt();
        System.out.println("java수업.시간 = " + 시간);
        초 = 시간%60;
        분 = (시간/60)%60;
        시 = (시간/60) /60;


        System.out.println(시+"시"+분+"분"+초+"초");




    }
}