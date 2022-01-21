package BOJ.stage07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCnt = Integer.parseInt(br.readLine()); // 숫자의 갯수
        int sum = 0; // 값 누적
        String[] num = br.readLine().split(""); // 입력받은 문자열을 공백 없이 잘라 배열에 담는다.

        // String 타입 배열에 담긴 각각의 숫자를 int 타입으로 변환과 함께 sum 변수에 값을 누적시킨다.
        for (int i = 0 ; i < numCnt ; i++) {
            sum += Integer.parseInt(num[i]);
        }

        System.out.println(sum);
    }
}

// 메모리 : 14384 KB
// 시간 : 124 ms