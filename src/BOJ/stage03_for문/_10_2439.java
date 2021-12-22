package BOJ.stage03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < N ; j++) {
                if (N - j > i + 1) {
                    stringBuilder.append(" ");
                } else {
                    stringBuilder.append("*");
                }
            }
            stringBuilder.append("\n");
        }
        bufferedReader.close();
        System.out.println(stringBuilder);
    }
}

// 메모리 : 14204 KB
// 시간 : 128 ms
