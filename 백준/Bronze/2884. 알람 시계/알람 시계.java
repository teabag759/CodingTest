import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // m이 45보다 작은 경우
        if (m < 45) {
            h--;
            m = m + 15;

            // h가 음수인 경우
            if (h < 0) {
                h = 23;
            }
        } else {
            m = m - 45;
        }

        System.out.println(h + " " + m);
    }
}
