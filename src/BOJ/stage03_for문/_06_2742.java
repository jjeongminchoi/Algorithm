package BOJ.stage03_for문;

import java.io.*;

public class _06_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = N ; i >= 1 ; i--) {
            bufferedWriter.write(i + "\n");
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

// 메모리 : 26024 KB
// 시간 : 200 ms
