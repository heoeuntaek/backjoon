import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();


        while (true) {
            String[] str = br.readLine().split(" ");
            ArrayList<Integer> al = new ArrayList<>();

            for (String s : str) {
                al.add(Integer.parseInt(s));
            }
            if (zero(al)) {
                break;
            }

            al.sort(Collections.reverseOrder());
            int a = al.get(0);
            int b = al.get(1);
            int c = al.get(2);
            if (isTriangle(a, b, c)) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean isTriangle(int a, int b, int c) {
        return (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)));
    }

    private static boolean zero(ArrayList<Integer> al) {
        if (al.get(0) == 0) {
            if (al.get(1) == 0) {
                if (al.get(2) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
