package BOJ.stage03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _08_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0 ; i < T ; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            int index = i + 1;
            int result = A + B;

            stringBuilder.append("Case #").append(index).append(": ")
                    .append(A).append(" + ").append(B).append(" = ")
                    .append(result).append("\n");
        }
        bufferedReader.close();
        System.out.println(stringBuilder);
    }
}

// 메모리 : 11584 KB
// 시간 : 76 ms