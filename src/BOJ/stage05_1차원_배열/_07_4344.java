package BOJ.stage05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int testCnt = Integer.parseInt(br.readLine()); // 테스트케이스 개수
        int sum = 0; // 점수 합계
        double avg = 0; // 점수 평균 & 학생 비율
        int count = 0; // 평균이 넘는 학생 수
        String[] res = new String[testCnt];

        // 테스트케이스 수만큼 반복
        for (int i = 0 ; i < testCnt ; i++) {
            String[] testCase = br.readLine().split(" "); // i번째 테스트케이스
            for (int j = 1 ; j <= Integer.parseInt(testCase[0]) ; j++) {
                sum += Integer.parseInt(testCase[j]);
            }
            avg = (double) sum / (double) Integer.parseInt(testCase[0]); // 평균 점수

            // 평균 점수를 넘긴 학생의 수 세기
            for (int k = 1 ; k <= Integer.parseInt(testCase[0]) ; k++) {
                if (Integer.parseInt(testCase[k]) > avg) {
                    count++;
                }
            }

            avg = (double) count / (double) Integer.parseInt(testCase[0]) * 100; // 평균을 넘은 학생 비율
            res[i] = String.format("%.3f", avg); // 소수점 3째자리까지 반올림해서 저장.
            result.append(res[i]).append("%").append("\n");

            sum = 0; // 합계 초기화
            count = 0; // 카운트 초기화
        }

        System.out.println(result);
        br.close();
    }
}

// 메모리 : 15844 KB
// 시간 : 176 ms