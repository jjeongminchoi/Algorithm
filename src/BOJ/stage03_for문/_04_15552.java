package BOJ.stage03_for문;

import java.io.*;

public class _04_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] arr;

        for (int i = 0 ; i < T ; i++) {
            String num = br.readLine();

            arr = num.split(" ");

            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);

            bw.write(A + B + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

// 메모리 : 297848 KB
// 시간 : 968 ms