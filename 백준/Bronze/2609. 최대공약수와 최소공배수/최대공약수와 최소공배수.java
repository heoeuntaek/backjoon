import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int i = 2;
        ArrayList<Integer> al = new ArrayList<>();
        while (i<=a && i<=b) {

            //둘다 나누어지면
            if (a % i == 0 && b % i == 0) {
                al.add(i);
                a /= i;
                b /= i;
            } else {
                i++;
            }
        }
        int mul = 1;
        for (Integer integer : al) {
            mul = mul * integer;
        }
        sb.append(mul).append("\n");
        sb.append(mul * a * b);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
