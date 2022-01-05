package BOJ.stage05_1차원_배열;

import java.io.*;

public class _04_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int B = 42; // 나눌 값
        int[] remainderNum = new int[B]; // 나머지 값을 인덱스로 할 배열 선언
        int count = 0;

        // 나머지 값을 인덱스로 활용하여 해당 인덱스 +1을 해준다
        for (int i = 0 ; i < 10 ; i++) {
            int A = Integer.parseInt(br.readLine());
            remainderNum[A % B]++;
        }

        // 해당 인덱스의 값이 0보다 크면 카운트한다
        for (int i = 0 ; i < remainderNum.length ; i++) {
            if (remainderNum[i] > 0) {
                count++;
            }
        }
        System.out.println(count);

        br.close();
    }
}

// 메모리 : 14204 KB
// 시간 : 120 ms