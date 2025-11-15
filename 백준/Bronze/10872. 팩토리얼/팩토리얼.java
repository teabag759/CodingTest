import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            // 누적 곱인 거 잊지 말기..ㅎ
            factorial *= i;
        }

        System.out.println(factorial);
    }
}