import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String m = sc.next();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + (m.charAt(i) - '0');
        }

        System.out.println(sum);
    }
}