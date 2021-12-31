package BOJ.stage05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 배열 크기 선언

        // 배열 초기화
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(input.nextToken());
        }

        System.out.println(arr);
    }
}

// 메모리 :  KB
// 시간 :  ms