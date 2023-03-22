package 과제2;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class StringCalculate {
    public static boolean isNumeric(String str) {   //숫자인지 연산자인지 판별
        try {
            Integer.parseInt(str);
            return true;   //숫자인경우
        } catch (NumberFormatException e) {
            return false;   //연산자인경우
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {


            System.out.println("문자열 입력");
            String str = sc.nextLine();


            StringTokenizer st = new StringTokenizer(str, "+-", true);  // StringTokenizer를 이용해서 문자열을 분리하여 저장

            Vector<String> v = new Vector<>(); // 벡터 생성

            while (st.hasMoreTokens()) { // 다음 토큰이 있는지 확인
                v.add(st.nextToken()); // 다음 토큰을 벡터에 저장

            }
            int sum = 0; // 초기화
            int plus = 1;  // 플러스가 1이면 더하기, 0이면 빼기
            int operator = 0;  //연산자가 연속해서 2번 나오는 경우를 위한 변수
            for (int i = 0; i < v.size(); i++) {

                boolean numeric = isNumeric(v.get(i));


//            첫번째일경우
                if (i == 0) {
                    sum = sum + Integer.parseInt(v.get(i));
                } else {  //두번째 행부터
                    if (!numeric) {   //연산자인 경우
                        operator++;
                        if (operator == 2) {  //연산자가 연속해서 2번 나오는 경우 프로그램 종료
                            return;
                        }
                        if (v.get(i).equals("+")) {
                            plus = 1;
                        } else if (v.get(i).equals("-")) {
                            plus = 0;
                        }

                        //숫자일 경우
                    } else {
                        if (plus == 1)  //더하기
                        {
                            sum = sum + Integer.parseInt(v.get(i));
                            operator = 0;
                        } else if (plus == 0) {
                            sum = sum - Integer.parseInt(v.get(i));
                            operator = 0;
                        }

                    }

                }
            }
            System.out.println("sum = " + sum);
        }


    }
}