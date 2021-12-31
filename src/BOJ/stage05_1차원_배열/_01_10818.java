package BOJ.stage05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 배열 크기 선언
        int max; // 최댓값
        int min; // 최솟값

        StringTokenizer input = new StringTokenizer(br.readLine());
        // 배열 초기화
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(input.nextToken());
        }

        max = arr[0];
        min = arr[0];

        // 최댓값 & 최솟값 구하기
        for (int i = 1 ; i < arr.length ; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);

        br.close();
    }
}

// 메모리 : 91580 KB
// 시간 : 484 ms