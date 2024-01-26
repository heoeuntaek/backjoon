import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);



        str = br.readLine().split(" ");

        int sum = 0;

        int max = 0;

        int fir;
        int sec;
        int thi;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String s : str) {
            int number = Integer.parseInt(s);
            arrayList.add(number);
        }

        fir=0;
        while (fir <= n - 3) {
            sec = fir + 1;
            while (sec <= n - 2) {
                thi=sec+1;
                while (thi <= n - 1) {
                    sum = arrayList.get(fir) + arrayList.get(sec) + arrayList.get(thi);
                    if (sum <= m) {
                        if (sum > max) {
                            max = sum;
                        }
                    }
                    thi++;
                }
                sec++;
            }
            fir++;
        }

        sb.append(max);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
