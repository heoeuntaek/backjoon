package 과제2;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년원일을 입력하시오");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, "/"); // 문자열을 구분자로 분리

        String []array = new String[3]; // 배열 선언
        int i=0;
        while (st.hasMoreTokens()) { // 구분자로 분리된 문자열이 있는지 검사
            array[i] = st.nextToken(); // 구분자로 분리된 문자열을 배열에 저장
            i++;
        }

        String year = array[0];
        String month = array[1];
        String day = array[2];


        System.out.println(year.length());
        if (year.length() == 2){ // 년도의 길이가 2일 경우
            year = "20" + year; // 20**년도로 변환
        }

        System.out.println(year + "년 " + month + "월 " + day + "일");


        int year_int = Integer.parseInt(year);
        int month_int = Integer.parseInt(month);
        int day_int = Integer.parseInt(day);


        Calendar firstDate = Calendar.getInstance();
        firstDate.clear(); // 현재 날짜와 시간 정보를 모두 지운다.
        firstDate.set(year_int, month_int-1, day_int); // 2016년 12월 25일. 12월은 11로 설정
        firstDate.get(Calendar.YEAR);
        firstDate.get(Calendar.MONTH);
        firstDate.get(Calendar.DAY_OF_MONTH);
        System.out.println(firstDate.get(Calendar.YEAR) + "년 " + (firstDate.get(Calendar.MONTH)+1) + "월 " + firstDate.get(Calendar.DAY_OF_MONTH) + "일");


        
    }
}