package BOJ.stage03_for문;

import java.util.Scanner;

public class _03_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 1 ~ n 까지의 합
        int sumResult = 0;

        for (int i = 1 ; i <= n ; i++) {
            sumResult += i;
        }
        System.out.println(sumResult);
    }
}

// 메모리 : 12840 KB
// 시간 : 108 ms