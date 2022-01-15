package BOJ.stage06_함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Test {
    long sum (int[] num) {
        long ans = 0;

        for (int i = 0 ; i < num.length ; i++) {
            ans += num[i];
        }

        return ans;
    }
}

public class _01_15596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer input = new StringTokenizer(br.readLine());
        long ans;

        for (int i = 0 ; i < num.length ; i++) {
            num[i] = Integer.parseInt(input.nextToken());
        }

        Test t = new Test();

        ans = t.sum(num);

        System.out.println(ans);
    }
}

// 메모리 : 422968 KB
// 시간 : 24 ms