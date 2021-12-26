package BOJ.stage04_while문;

import java.io.*;
import java.util.StringTokenizer;

public class _01_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean flag = true;

        while (flag) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            int sum = A + B;

            if (sum > 0) {
                bufferedWriter.write(sum + "\n");
            } else {
                flag = false;
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}

// 메모리 : 15884 KB
// 시간 : 144 ms