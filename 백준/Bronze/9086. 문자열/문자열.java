import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
            String line = br.readLine();
            sb.append(line.charAt(0)); 
            sb.append(line.charAt(line.length() - 1)); 
            sb.append('\n'); // 줄바꿈
        }

        System.out.print(sb);

        br.close();
    }
}