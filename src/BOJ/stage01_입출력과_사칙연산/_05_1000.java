package BOJ.stage01_입출력과_사칙연산;

// 1000번 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class _05_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
    }
}

// 메모리 : 12984 KB
// 시간 :  120 ms