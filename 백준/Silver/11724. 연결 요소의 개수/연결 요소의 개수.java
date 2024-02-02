import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static boolean visite[];
    static ArrayList<Integer> array[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  //노드(정점) 개수
        int m = Integer.parseInt(st.nextToken());  //간선 개수

        //방문노드
        visite = new boolean[n + 1];
        for (int i = 1; i < n + 1; i++) {
            visite[i] = false;
        }

        //인접리스트 배열
        array = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            array[i] = new ArrayList<>();
        }

        //각 인접리스트 마다 인접 노드 추가
        for (int i = 1; i < m + 1; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            array[start].add(end);
            array[end].add(start);
        }

        //시작
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        // visite[v]가 모두 false 가 아니라면
        for (int i = 1; i < n + 1; i++) {
            if (!visite[i]) {
                count++;
                stack.push(i);
                while (!stack.isEmpty()) {
                    int v = stack.pop();
                    if (!visite[v]) {

                        visite[v] = true;
                        for (int j = 0; j < array[v].size(); j++) {
                            int get = array[v].get(j);
                            if (!visite[get]) {
                                stack.push(get);
                            }
                        }

                    }

                }
            }
        }


        sb.append(count);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }


}
