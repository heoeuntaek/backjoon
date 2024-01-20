import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9012 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int sum = 0;
            boolean breakIt = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    sum++;
                } else {  //(str.charAt(j) == ')')
                    sum--;
                }

                if (sum < 0) {
                    sb.append("NO").append('\n');
                    breakIt = true;
                    break;
                }
            }
            if (breakIt) {
                continue;
            }
            if (sum == 0) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        br.close();
        System.out.print(sb);
    }
}
