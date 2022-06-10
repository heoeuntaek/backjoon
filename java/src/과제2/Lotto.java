package 과제2;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Lotto {
    public static void main(String[] args) {


        Vector<Integer> v = new Vector<>(); // 벡터 생성
        int arleady = 0; // 중복변수
        int number = 0; // 랜덤생성된 변수를 초기화
        for (int i = 0; i < 6; i++) {  //6번 반복

            while (true) {  //반복분
                arleady = 0;
                number = (int) (Math.random() * 45 + 1);   // 1~45 사이의 랜덤수 생성

                //중복변수
                for (int j : v) { //벡터에 있는 변수들을 반복
                    if (number == j) arleady = 1; //중복이라면 중복변수 1지정
                }
                if (arleady == 0) break;  //중복변수가 0이라면 반복분 탈출
            }
            v.add(number); //벡터에 추가
        }

        Collections.sort(v); //벡터 정렬(오름차순)
        number = (int) (Math.random() * 45 + 1); //마지막 자연수 생성
        v.add(number);


        for (Object k : v) { // 출력
            System.out.println(k);
        }


    }
}