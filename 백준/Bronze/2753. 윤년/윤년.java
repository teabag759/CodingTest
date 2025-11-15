import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isLeapYear = Integer.parseInt(sc.nextLine());

        if (isLeapYear % 4 == 0) {
            if (isLeapYear % 100 != 0 || isLeapYear % 400 == 0) {
                System.out.println(1);
            } else {
                // 중첩 반복문이 거짓인 경우 
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}