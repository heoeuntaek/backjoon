package practice;

public class 행 {

    public static void main(String[] args) {
        int [][]array ={{1}, {1,2,3},{1},{1,2,3,4},{1,2}};
        double sum=0;

        for (int i = 0; i < array.length; i++) { //행
            sum =0;
            for (int j = 0; j < array[i].length; j++) {  //열
                sum += array[i][j];
            }
            System.out.println(i+"번째행의 평균 :"+sum/ array[i].length);
        }
    }


}