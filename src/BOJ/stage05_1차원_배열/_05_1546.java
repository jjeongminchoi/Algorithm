package BOJ.stage05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _05_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 과목 갯수
        StringTokenizer input = new StringTokenizer(br.readLine());

        int[] score = new int[N]; // 과목 점수 담을 배열 선언
        int M = 0; // 최고 점수.
        double sum = 0;
        double avg;

        // 점수 초기화
        for (int i = 0 ; i < score.length ; i++) {
            score[i] = Integer.parseInt(input.nextToken());
        }

        // 최고 점수 구하기
        Arrays.sort(score);
        M = score[N-1];

        // 점수 합계
        for (int i = 0 ; i < score.length ; i++) {
            sum += (double) score[i] / M * 100;
        }

        avg = sum / (double) N;
        System.out.println(avg);

        br.close();
    }
}

// 메모리 : 14392 KB
// 시간 : 128 ms