import java.io.*;
import java.util.Stack;

public class b1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int x = 1;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            //number가 나와야 함
            while (true) {

                if (!stack.empty()) {
                    if (stack.peek() > number) {
                        sb.setLength(0);
                        sb.append("NO").append('\n');
                        bw.flush();
                        bw.write(String.valueOf(sb));
                        bw.close();
                        br.close();
                        return;
                    }
                }

                if (!stack.empty()) {
                    if (stack.peek() == number) {
                        stack.pop();
                        sb.append("-").append('\n');
                        break;
                    }
                }

                if (x <= number) {
                    stack.push(x);
                    sb.append("+").append('\n');
                    x++;
                }

            }


        }
        bw.flush();
        bw.write(String.valueOf(sb));
        bw.close();
        br.close();


    }
}
