import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (v == arr[i]) {
                count++;
            }
        }

        System.out.println(count);

    }
}