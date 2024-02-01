import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        long beforeTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(str[i]);
            set.add(a);
        }

        n = Integer.parseInt(br.readLine());
        str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(str[i]);

            if (set.contains(a)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }


        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long diffTime = afterTime - beforeTime; // 두 개의 실행 시간
//        System.out.println("실행 시간(ms): " + diffTime); // 세컨드(초 단위 변환)

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


        //시간 초과가 나왔다.

    }
}
