import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

//        M이상 N이하의 소수를 모두 출력하는 프로그램

//        입력
//        3 16
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        ArrayList<Integer> al = new ArrayList<>();
//        한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.  오름차순으로

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                al.add(i);
            }

        }

        for (Integer i : al) {
            sb.append(i).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int j = 3; j*j<= number; j+=2) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;

    }
}
