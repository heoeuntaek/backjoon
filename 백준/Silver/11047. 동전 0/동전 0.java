import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int count=0;
        ArrayList<Integer> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            coins.add(a);
        }

        Collections.sort(coins, Collections.reverseOrder());

        for (int coin : coins) {
            if (target >= coin) {
                int share = target / coin;
                int remain = target % coin;
                target = remain;
                count += share;
            }
        }

        sb.append(count);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
