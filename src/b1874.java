import java.io.*;
import java.util.Stack;

public class b1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

d
        int n = Integer.parseInt(br.readLine());
        int x = 1;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            //number가 나와야 함
            while (x <= number) {
                stack.push(x);
                sb.append("+").append('\n');
                x++;
            }

            if (!stack.empty()) {
                if (stack.peek() > number) {
                    sb.setLength(0);
                    sb.append("NO").append('\n');
                    break;
                }

                if (stack.peek() == number) {
                    stack.pop();
                    sb.append("-").append('\n');
                }

            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}
