import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 조건: 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다.
        // (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
        long seunghwan = sc.nextLong();
        long kyuhyun = sc.nextLong();

        System.out.println(Math.abs(seunghwan - kyuhyun));
    }
}