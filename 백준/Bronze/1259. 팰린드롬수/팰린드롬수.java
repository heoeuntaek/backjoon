import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();


        while (true) {
            String str = br.readLine();
            if (Integer.parseInt(str) == 0) {
                break;
            }
            int front = 0;
            int back = str.length() - 1;

            while (true) {
                if (front > back) {
                    sb.append("yes").append("\n");
                    break;
                }
                if (str.charAt(front) != str.charAt(back)) {
                    sb.append("no").append("\n");
                    break;
                }
                front++;
                back--;
            }
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}
