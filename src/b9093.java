import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//bj9093
public class b9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String[] words = br.readLine().split(" ");

            for (String word : words) {
                StringBuilder sb = new StringBuilder(word);
                System.out.print(sb.reverse().toString() + " ");

            }
            System.out.println();


        }


    }


}

