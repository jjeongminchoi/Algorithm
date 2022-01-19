package BOJ.stage06_함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 입력받은 수

        if (0 < N && N <= 1000) {
            int resCount = hansu(N);
            System.out.println(resCount);
        } else {
            System.out.println("잘 못 입력하셨습니다.");
        }
    }

    static private int hansu (int N) {
        int count = 0;
        int[] num = new int[3]; // 100 ~ 999는 3자리

        for (int i = 1 ; i <= N ; i++) { // 1 ~ 입력 받은 수 까지 반복.
            if (i < 100) { // 1 ~ 99까지의 수는 한수이므로 count++
                count++;
            } else if (i < 1000){ // 1000은 한수가 아니므로 제외
                String toStringNum = Integer.toString(i);
                for (int j = 0 ; j < num.length ; j++) {
                    num[j] = toStringNum.charAt(j) - '0';
                }
                if ( (num[0] - num[1]) == (num[1] - num[2]) ) {
                    count++;
                }
            }
        }
        return count;
    }
}

// 메모리 : 14216 KB
// 시간 : 124 ms