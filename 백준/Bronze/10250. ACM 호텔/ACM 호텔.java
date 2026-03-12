import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor = n % h;
            int room = (n / h) + 1;
            if (floor == 0) {
                floor = h;
                room = n / h;
            }

            sb.append((floor * 100) + room).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
