import java.io.*;
import java.util.Stack;

public class b1406_stack {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        Stack<Character> stack_left = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack_left.push(str.charAt(i));
        }

        Stack<Character> stack_right = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L':
                    if (!stack_left.empty()) {
                        stack_right.push(stack_left.pop());
                    }
                    break;
                case 'D':
                    if (!stack_right.empty()) {
                        stack_left.push(stack_right.pop());
                    }
                    break;
                case 'B':
                    if (!stack_left.empty()) {
                        stack_left.pop();
                    }
                    break;
                case 'P':
                    stack_left.push(command.charAt(2));
                    break;

            }
        }
        StringBuilder sb = new StringBuilder();
        int size = stack_left.size();

        for (int i = 0; i < size; i++) {
            stack_right.push(stack_left.pop());
        }
        size = stack_right.size();
        for (int i = 0; i < size; i++) {
            sb.append(stack_right.pop());
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }


}
