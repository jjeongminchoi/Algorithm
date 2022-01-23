package BOJ.stage07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int testCaseCnt = Integer.parseInt(br.readLine()); // 테스트케이스 갯수

        for (int i = 0 ; i < testCaseCnt ; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine()); // 입력 문자열

            int repeatCnt = Integer.parseInt(input.nextToken()); // 반복 수
            String string = input.nextToken(); // 반복할 문자
            String[] stringArr = string.split(""); // 반복할 문자열의 문자를 배열에 각각 담는다.

            // 각각의 문자를 반복 수만큼 반복하기 위해 문자열의 길이만큼 반복한다.
            for (int j = 0 ; j < stringArr.length ; j++) {
                for (int k = 0 ; k < repeatCnt ; k++) {
                    result.append(stringArr[j]);
                }
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}

// 메모리 : 14256 KB
// 시간 : 132 ms