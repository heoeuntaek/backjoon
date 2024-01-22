import java.io.IOException;

public class 연습 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder("abc");
//        sb.deleteCharAt(3);
        sb.insert(0, "x");

        System.out.println("sb = " + sb);

    }
}
