import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());


        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = -10000000; i < 10000001; i++) {
//            hashMap.put(i, 0);
//        }

        String[] first = br.readLine().split(" ");
        for (String s : first) {
            int a = Integer.parseInt(s);
            if (hashMap.get(a) == null) {
                hashMap.put(a, 1);
            } else {
                Integer original = hashMap.get(a);
                hashMap.put(a, ++original);
            }

        }


        int ae = Integer.parseInt(br.readLine());
        String[] second = br.readLine().split(" ");

        for (String s : second) {
            int a = Integer.parseInt(s);

            if (hashMap.get(a) == null) {
                sb.append(0).append(" ");
            } else {
                Integer count = hashMap.get(a);
                sb.append(count).append(" ");
            }

        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
