package 과제2;

import java.util.Calendar;

public class Date_Time {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // 현재 시간을 가져온다.
        int year = now.get(Calendar.YEAR); // 현재 년도를 가져온다.
        int month = now.get(Calendar.MONTH); // 현재 월을 가져온다.
        int day = now.get(Calendar.DAY_OF_MONTH); // 현재 일을 가져온다.
        int hour = now.get(Calendar.HOUR_OF_DAY); // 현재 시간을 가져온다.
        int minute = now.get(Calendar.MINUTE); // 현재 분을 가져온다.
        int second = now.get(Calendar.SECOND); // 현재 초를 가져온다.

        System.out.println(year + "년 " + month + "월 " + day + "일 " +"\n"+ hour + "시 " + minute + "분 " + second + "초");

    }

}