package BOJ.stage02_if문;

import java.util.Scanner;

public class _05_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(); // 시
        int M = sc.nextInt(); // 분
        int minusM = M - 45;

        if(minusM < 0) {
            if (H == 0) {
                H = 23;
            } else {
                H--;
            }
            M = 60 + minusM;
        } else {
            M = minusM;
        }
        System.out.print(H + " " + M);
    }
}

// 메모리 : 12856 KB
// 시간 : 112 ms