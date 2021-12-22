package BOJ.stage03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _09_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0 ; i < N ; i++) {
            int num = i + 1; // *을 몇 번 찍을 지 담은 변수.
            for (int j = 0 ; j < num ; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }

        bufferedReader.close();
        System.out.println(stringBuilder);
    }
}

// 메모리 : 11508 KB
// 시간 : 76 ms