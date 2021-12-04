package BOJ.stage01_입출력과_사칙연산;

/*
10430번

(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class _10_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res1 = (a+b)%c;
        int res2 = ((a%c) + (b%c))%c;
        int res3 = (a*b)%c;
        int res4 = ((a%c) * (b%c))%c;

        if(res1 == res2) {
            System.out.println(res1);
            System.out.println(res2);
        } else {
            System.out.println("res1과 res2는 같지 않습니다.");
        }
        if(res3 == res4){
            System.out.println(res3);
            System.out.println(res4);
        } else {
            System.out.println("res3와 res4는 같지 않습니다.");
        }

    }
}

// 메모리 : 12888 KB
// 시간 :  112 ms