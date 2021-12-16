package BOJ.stage03_for문;

import java.io.*;

public class _05_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1 ; i <= N ; i++) {
            bufferedWriter.write(i + "\n");
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

// 메모리 : 25976 KB
// 시간 : 204 ms