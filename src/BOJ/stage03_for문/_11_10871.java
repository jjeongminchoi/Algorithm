package BOJ.stage03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int A = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0 ; i < A ; i++) {
            int num = Integer.parseInt(st2.nextToken());
            if (N > num) {
                result.append(num).append(" ");
            }
        }
        bufferedReader.close();
        System.out.println(result);
    }
}

// 메모리 : 15284 KB
// 시간 : 164 ms