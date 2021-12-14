package BOJ.stage03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] arr;
        int A, B;

        for (int i = 0 ; i < T ; i++) {
            String num = br.readLine();

            arr = num.split(" ");

            A = Integer.parseInt(arr[0]);
            B = Integer.parseInt(arr[1]);

            System.out.println(A + B);
        }
    }
}

// 메모리 :  KB
// 시간 :  ms