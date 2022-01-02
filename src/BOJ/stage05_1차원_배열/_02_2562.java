package BOJ.stage05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _02_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int maxNum = 0;
        int checkCnt = 0;

        int[] arr = new int[9]; // 서로 다른 자연수 저장할 곳 선언
        // 배열 초기화
        for (int i = 0 ; i < arr.length ; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(input.nextToken());
        }

        // 최댓값 체크
        for (int i = 0 ; i < arr.length ; i++) {
            int temp = arr[i]; // 비교할 대상

            if (temp > maxNum) {
                maxNum = temp;
                checkCnt = i+1; // 최댓값이 몇 번째 수인지 체크
            }
        }
        result.append(maxNum).append("\n").append(checkCnt);
        System.out.println(result);

        br.close();
    }
}

// 메모리 : 14252 KB
// 시간 : 124 ms