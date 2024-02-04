import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static Stack<Integer> stack;
    static boolean[] visited;
    static int[] abCheck;
    static ArrayList<Integer>[] adList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int cycle = Integer.parseInt(br.readLine());

        while (cycle-- > 0) {
            stack = new Stack<>();
            int already = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int edge = Integer.parseInt(st.nextToken());

            visited = new boolean[node + 1];
            abCheck = new int[node + 1];

            adList = new ArrayList[node + 1];
            for (int i = 1; i <= node; i++) {
                adList[i] = new ArrayList<>();
            }

            while (edge-- > 0) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                adList[start].add(end);
                adList[end].add(start);
            }

            // 모든 노드에 대해 DFS를 실행하여 이분 그래프 판별
            for (int i = 1; i <= node; i++) {
                if (!visited[i]) {
                    if (!DFS(i)) {
                        sb.append("NO").append("\n");
                        already = 1;
                        break;
                    }
                }
            }

            if (already == 0) {
                sb.append("YES").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean DFS(int startNode) {
        stack.push(startNode);
        visited[startNode] = true;
        abCheck[startNode] = 1;

        while (!stack.isEmpty()) {
            int pop = stack.pop();
            for (int i = 0; i < adList[pop].size(); i++) {
                int input = adList[pop].get(i);

                if (!visited[input]) {
                    visited[input] = true;
                    stack.push(input);
                    abCheck[input] = abCheck[pop] == 1 ? 2 : 1;
                } else {
                    if (abCheck[input] == abCheck[pop]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
