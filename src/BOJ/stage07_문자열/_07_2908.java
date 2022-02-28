package BOJ.stage07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _07_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputNum = new StringTokenizer(br.readLine());

        StringBuilder numA = new StringBuilder(inputNum.nextToken());
        StringBuilder numB = new StringBuilder(inputNum.nextToken());

        int resA = Integer.parseInt(numA.reverse().toString());
        int resB = Integer.parseInt(numB.reverse().toString());

        if(resA > resB) {
            System.out.println(resA);
        } else { 
            System.out.println(resB);
        }
    }
}

// 메모리 : 14200 KB
// 시간 : 120 ms
