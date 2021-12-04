package BOJ.stage02_if문;

import java.util.Scanner;

public class _01_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println(">");
        }
        if(a < b) {
            System.out.println("<");
        }
        if(a == b) {
            System.out.println("==");
        }
    }
}

// 메모리 : 12844 KB
// 시간 : 108 ms