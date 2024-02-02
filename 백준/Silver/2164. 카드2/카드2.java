import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        //        N장의 카드가 있다. 각각의 카드는 차례로 1부터 N까지의 번호가 붙어 있으며,
//        1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

//        카드가 한 장 남을 때까지 반복하게 된다.
        while (queue.size() != 1) {
            queue.remove();
            //            제일 위에 있는 카드를 바닥에 버린다.

//            그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
            Integer remove = queue.remove();
            queue.add(remove);

        }
        sb.append(queue.peek()).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
