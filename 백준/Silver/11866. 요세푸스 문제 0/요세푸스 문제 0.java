import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        int original = target;
        ArrayList<Integer> al = new ArrayList<>();
        while (!queue.isEmpty()) {
            target = original;
            while (target-1 > 0) {
                queue.add(queue.poll());
                target--;
            }
            al.add(queue.poll());
        }

        sb.append("<");
        int index = 0;
        for (Integer i : al) {
            if (index != 0) {
                sb.append(", ");
            }
            sb.append(i);
            index++;
        }
        sb.append(">");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

