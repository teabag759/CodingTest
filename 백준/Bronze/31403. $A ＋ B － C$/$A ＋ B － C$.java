import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();

        // 1번째: a, b, c 모두 숫자일 경우
        System.out.println(a + b - c);

        // 2번째: 문자(ab) - 숫자(c)
        String ab = "" + a + b;
        System.out.println(Integer.parseInt(ab)-c);

    }
}
