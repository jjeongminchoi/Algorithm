package BOJ.stage05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _03_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int[] num = new int[3];
        int multiply = 1;
        for (int i = 0 ; i < num.length ; i++) {
            num[i] = Integer.parseInt(br.readLine());
            multiply *= num[i];
        }

//        String num2 = Integer.toString(multiply);
        int[] numCount = new int[10];
        for (int i = 0 ; i < numCount.length ; i++) {
//            numCount[num2.charAt(i) - 48]++;
            if (multiply < 0) {
                break;
            } else {
                numCount[multiply % 10]++;
                multiply /= 10;
            }
        }

        for (int i = 0 ; i < numCount.length ; i++) {
            result.append(i + " : ").append(numCount[i]).append("번").append("\n");
        }
        System.out.println(result);

        br.close();
    }
}

// 메모리 : 14252 KB
// 시간 : 124 ms