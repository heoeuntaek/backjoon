import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 연습 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String s = "1324";
        int a = 132;
        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
//        bw.flush();

    }
}
