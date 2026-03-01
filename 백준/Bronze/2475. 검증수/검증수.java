import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        long answer = verification(st);

        System.out.println(answer);
    }

    public static long verification(StringTokenizer st) {

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long e = Long.parseLong(st.nextToken());

        long squareSum = (a * a) + (b * b) + (c * c) + (d * d) + (e * e);

        return squareSum % 10;
    }
}