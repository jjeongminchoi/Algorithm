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
        double avg = 0; // 점수 평균
        double count = 0; // 평균이 넘는 학생 수
        double[] res = new double[testCnt];

        for (int i = 0 ; i < testCnt ; i++) {
            String[] testCase = br.readLine().split(" "); // 테스트케이스
            for (int j = 1 ; j <= Integer.parseInt(testCase[0]) ; j++) {
                sum += Integer.parseInt(testCase[j]);
            }
            avg = sum / Integer.parseInt(testCase[i]);

            for (int k = 1 ; k <= Integer.parseInt(testCase[0]) ; k++) {
                if (Integer.parseInt(testCase[k]) > (int) avg) {
                    count++;
                }
            }

            avg = Math.round(count / (double) Integer.parseInt(testCase[0]) * 100);
            res[i] = avg;
            result.append(res[i]).append("%").append("\n");
            sum = 0;
            count = 0; // 카운트 초기화
        }

        System.out.println(result);
        br.close();
    }
}

// 메모리 :  KB
// 시간 :  ms