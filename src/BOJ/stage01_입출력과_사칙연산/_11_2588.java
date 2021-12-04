package BOJ.stage01_입출력과_사칙연산;

import java.util.Scanner;

public class _11_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b;

        for(int i = 0 ; i < 3 ; i++) {
            int val = c % 10;
            System.out.println(a * val);
            c /= 10;
        }
        System.out.println(a * b);

    }
}

// 메모리 : 12832 KB
// 시간 : 108 ms
