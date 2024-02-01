import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList<>();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);


        String[] str1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(str1[i]);
            al.add(number);
        }

        //합배열
        ArrayList<Integer> sumAl = new ArrayList<>();
        sumAl.add(al.get(0));
        for (int i = 1; i < n; i++) {
            int sum = sumAl.get(i - 1) + al.get(i);
            sumAl.add(sum);
        }


        for (int i = 0; i < m; i++) {
            String[] str2 = br.readLine().split(" ");
            int start = Integer.parseInt(str2[0]) - 1;
            int end = Integer.parseInt(str2[1]) - 1;
            int result = 0;
            if (start == 0) {
                result = sumAl.get(end);
            } else {
                result = sumAl.get(end) - sumAl.get(start - 1);
            }
            
            sb.append(result).append("\n");
//            int sum =0;
//            for (int j = start - 1; j <= end - 1; j++) {
//                sum += al.get(j);
//            }
//            sb.append(sum).append("\n");

        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
