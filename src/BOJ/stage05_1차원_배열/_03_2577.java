package BOJ.stage05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        // 입력받은 3개의 숫자 곱하기
        int[] num = new int[3];
        int multiply = 1;
        for (int i = 0 ; i < num.length ; i++) {
            num[i] = Integer.parseInt(br.readLine());
            multiply *= num[i];
        }

        // 곱한 값을 10으로 나눈 나머지를 인덱스로 활용하여 해당 인덱스 +1 카운트 후 10으로 나눈다.
        // 만약 곱한 값이 0이하라면 카운트를 그만한다.
        int[] numCount = new int[10];
        for (int i = 0 ; i < numCount.length ; i++) {
            if (multiply > 0) {
                numCount[multiply % 10]++;
            } else {
                break;
            }
            multiply /= 10;
        }

        // 결과 출력
        for (int i : numCount) {
            result.append(i).append("\n");
        }

        System.out.println(result);
        br.close();
    }
}

// 메모리 : 14180 KB
// 시간 : 124 ms