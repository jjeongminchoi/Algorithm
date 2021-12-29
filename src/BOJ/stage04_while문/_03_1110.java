package BOJ.stage04_while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class _03_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine(); // 최초 숫자
        String newNum = null; // 변하는 숫자 & 최종 숫자
        int count = 0;
        boolean flag = !Objects.equals(num, newNum);

        while (flag) { // 최초 숫자와 최종 숫자가 같으면 false 로 종료.
            newNum = num;
            if (Integer.parseInt(newNum) < 10) {
                newNum = "0" + newNum;
            }
            int A = newNum.charAt(0);
            int B = newNum.charAt(1);
            int sum = A + B;
            newNum = B + Integer.toString(sum);

            count++;
        }
        System.out.println(count);
    }
}

// 메모리 : 14144 KB
// 시간 : 124 ms