package BOJ.stage05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int score = 0;
        int testCnt = Integer.parseInt(br.readLine());
        int[] res = new int[testCnt];

        // 테스트 케이스 만큼 반복문을 돌린다.
        for (int i = 0 ; i < testCnt ; i++) {

            // split()으로 입력한 문자열을 잘라 배열에 담는다.
            String[] ox = br.readLine().split("");

            // 입력된 ox 만큼 크기를 잡아 점수를 센다.
            for (int j = 0 ; j < ox.length ; j++) {
                if ("O".equals(ox[j])) {
                    ++score;
                    res[i] += score;
                } else {
                    score = 0;
                }
            }
            score = 0;
        }

        for (int i = 0 ; i < res.length ; i++) {
            result.append(res[i]).append("\n");
        }

        br.close();
        System.out.println(result);
    }
}

// 메모리 : 14996 KB
// 시간 : 152 ms