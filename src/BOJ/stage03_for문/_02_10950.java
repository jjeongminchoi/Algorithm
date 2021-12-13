package BOJ.stage03_for문;

import java.util.Scanner;

public class _02_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스 갯수

        for (int i = 0 ; i < T ; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A + B);
        }
    }
}

// 메모리 : 13072 KB
// 시간 : 136 ms