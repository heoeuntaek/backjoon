import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int result = calculateExpression(str);

        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static int calculateExpression(String str) {
        String[] split = str.split("-");
        int result = 0;

        for (int i = 0; i < split.length; i++) {
            if (i == 0 && split[i].contains("+")) {
                result += calculateSum(split[i]);
            } else if (i == 0) {
                result += Integer.parseInt(split[i]);
            } else {
                result -= calculateSum(split[i]);
            }
        }

        return result;
    }

    private static int calculateSum(String s) {
        String[] split = s.split("\\+");
        int sum = 0;
        for (String string : split) {
            sum += Integer.parseInt(string);
        }
        return sum;
    }
}
