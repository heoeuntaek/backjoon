import java.io.*;

public class b1406 {
    public static void main(String[] args) throws IOException {
        long beforeTime = System.currentTimeMillis();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(br.readLine());
        int index = sb.length();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "L":
                    if (index != 0) {
                        index--;
                    }
                    break;
                case "D":
                    if (index != sb.length()) {
                        index++;
                    }
                    break;
                case "B":
                    if (index != 0) {
                        sb.deleteCharAt(--index);
                    }
                    break;
                case "P":
                    sb.insert(index++, command[1]);
                    break;

            }
        }

        bw.write(sb+"\n");
        bw.flush();
        bw.close();
        br.close();


    }
}
