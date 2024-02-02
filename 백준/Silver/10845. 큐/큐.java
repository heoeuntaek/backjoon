import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> al = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int number = 0;
            if (st.hasMoreTokens()) {
                number = Integer.parseInt(st.nextToken());
            }
            switch (command) {
                case "push":
                    al.add(number);
                    break;
                case "pop":
                    if (al.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        Integer a = al.get(0);
                        al.remove(0);
                        sb.append(a).append("\n");
                    }
                    break;
                case "size":
                    sb.append(al.size()).append("\n");
                    break;
                case "empty":
                    if (al.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");

                    }
                    break;
                case "front":
                    if (al.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(al.get(0)).append("\n");
                    }
                    break;
                case "back":
                    if (al.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(al.get(al.size() - 1)).append("\n");
                    }

                    break;
            }


        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
