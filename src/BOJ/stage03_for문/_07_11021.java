package BOJ.stage03_for문;

import java.io.*;

public class _07_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1 ; i <= T ; i++) {
            int A = Integer.parseInt(bufferedReader.readLine());
            int B = Integer.parseInt(bufferedReader.readLine());

            bufferedWriter.write("Case #" + i + ": " + (A + B) + "\n");
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

// 메모리 :  KB
// 시간 :  ms