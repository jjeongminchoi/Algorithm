package BOJ.stage03_for문;

import java.io.*;

public class _07_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());
        int index = 0;

        for (int i = 1 ; i <= T ; i++) {
            String num = bufferedReader.readLine();
            String[] arr = num.split(" ");
            int result = Integer.parseInt(arr[index]) + Integer.parseInt(arr[++index]);


            bufferedWriter.write("Case #" + i + ": " + result + "\n");

            index = 0;
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

// 메모리 : 11660 KB
// 시간 : 76 ms