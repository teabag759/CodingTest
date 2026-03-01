import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        br.close();

        long answer = at(a, b);

        System.out.println(answer);
    }

    public static long at(long a, long b) {
        return (a + b) * (a - b);
    }
}