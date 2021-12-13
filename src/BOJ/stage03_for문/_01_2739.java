package BOJ.stage03_for문;

import java.util.Scanner;

public class _01_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 단

        for (int i = 1 ; i <= 9 ; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}

// 메모리 : 12824 KB
// 시간 : 116 ms