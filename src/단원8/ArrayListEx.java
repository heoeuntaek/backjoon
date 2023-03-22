package 단원8;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {

        //문자열만 삽입가능한 array List 생성
        var a = new ArrayList<String>();

        //키보드로 4개의 이름 입력받아 ArrayList에 삽입
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("이름 입력 ");
            String s = scanner.next();
            a.add(s);
        }

//        모두 출력
        for (int i = 0; i < 4; i++) {
            String s = a.get(i);
            System.out.print(s+" ");
        }

        System.out.println("");
        //가장 긴 이름 출력
        int longestIndex =0;
        for (int i = 0; i < 4; i++) {
            if (a.get(longestIndex).length() < a.get(i).length()) {
                longestIndex = i;
            }

        }
        System.out.print("가장 긴 이름은 :");
        System.out.println(a.get(longestIndex));
        scanner.close();
    }
}