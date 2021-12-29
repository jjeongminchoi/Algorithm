package BOJ.stage04_while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class _03_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine(); // 최초 숫자
        String temp = num;
        String resNum = null; // 변하는 숫자 & 최종 숫자
        int count = 0;

        while (!Objects.equals(num, resNum)) { // 최초 숫자와 최종 숫자가 같으면 false 로 종료.
            if (temp.charAt(0) == '0') {
                temp = Integer.toString(temp.charAt(1) - 48);
            } else {
                if (Integer.parseInt(temp) < 10) {
                    temp = "0" + temp;
                }
                int A = temp.charAt(0) - 48;
                int B = temp.charAt(1) - 48;
                int sum = A + B;

                if (sum < 10) {
                    A = sum;
                } else {
                    A = Integer.toString(sum).charAt(1) - 48;
                }
                temp = B + Integer.toString(A);

                resNum = temp;
                count++;
            }
        }
        System.out.println(count);
    }
}

// 메모리 : 14144 KB
// 시간 : 124 ms