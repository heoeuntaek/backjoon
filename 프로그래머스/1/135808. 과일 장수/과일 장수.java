import java.io.*;
import java.util.*;

class Solution {
    static int sum;
    public int solution(int k, int m, int[] score) {
        ArrayList<Integer> al = new ArrayList<>();
//        array 배열로 옮겨담기
        for (int i = 0; i < score.length; i++) {
            al.add(score[i]);
        }
        //정렬
        al.sort(Comparator.reverseOrder());
        sum = 0;
        for(int i=m-1;i<al.size(); i+=m){
            sum+=m*al.get(i);
        }
        
        int answer = sum;
        return answer;
    }
}