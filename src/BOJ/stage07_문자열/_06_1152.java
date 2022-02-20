package BOJ.stage07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _06_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer word = new StringTokenizer(br.readLine().trim(), " ");
        System.out.println(word.countTokens());
        br.close();
    }
}

// 메모리 : 20016 KB
// 시간 : 272 ms
