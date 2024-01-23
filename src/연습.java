import java.io.*;
import java.util.Stack;

public class 연습 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        System.out.println("stack = " + stack.peek());
        stack.push(1);
        stack.push(2);
        stack.push(3);

        if (stack.pop() == 1) {
            System.out.println("true = " + true);
        }

        System.out.println("stack = " + stack.peek());
        
    }
}
