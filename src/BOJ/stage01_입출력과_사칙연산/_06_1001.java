package BOJ.stage01_입출력과_사칙연산;

// 1001번 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class _06_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a-b);
    }
}

// 메모리 : 12872 KB
// 시간 :  112 ms