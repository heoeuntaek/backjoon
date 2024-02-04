import java.util.ArrayList;
import java.io.*;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        // 문자열을 띄어쓰기로 구분해서 String 배열로 저장
        String str[] = s.split(" ");
           
        //문자열을 숫자로 변환하여 int 배열로 저장
        ArrayList<Integer>al = new ArrayList<>();
        for(int i=0;i<str.length; i++){
            al.add(Integer.parseInt(str[i]));    
        }
        
        
        Collections.sort(al);
        // 거기서 정렬
        int a= al.get(0);
        int b= al.get(al.size()-1);
        
        //출력
    
        
        
        String answer = a+" "+b;
        return answer;
    }
}