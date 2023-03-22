package 윈프;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;  //짝수
        int odd = 0;
        int evenC = 0; //짝수 개수
        int oddC = 0; // 홀수 개수
        int inputC = 0; //입력개수
        int i;

        while (true) {
            System.out.println("하나의 정수 입력");
            i = Integer.parseInt(sc.next());
            if (i == -1) {
                break;
            }

            if (i % 2 == 0) {
                even+=i;
                evenC++;
                inputC++;

            } else if (i % 2 == 1) {
                odd+=i;
                oddC++;
                inputC++;
            }

        }
        System.out.println("입력 데이터 개수는" + inputC);
        System.out.println("입력 데이터 짝수 개수는" + evenC);
        System.out.println("입력 데이터 짝수의 합은" + even);
        System.out.println("입력 데이터 홀수 개수는" + oddC);
        System.out.println("입력 데이터 홀수의 합은" + odd);

    }
}