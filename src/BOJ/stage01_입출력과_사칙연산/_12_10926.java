package BOJ.stage01_입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12_10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String regExp = "^[a-z]*$";
        String id = br.readLine();

        if (id.matches(regExp)) {
            if (id.length() <= 50) {
                result.append(id).append("??!");
                System.out.println(result);
            } else {
                System.out.println("id는 50자를 넘길 수 없습니다.");
            }
        } else {
            System.out.println("id는 소문자만 입력가능합니다.");
        }
        br.close();
    }
}

// 메모리 : 14368 KB
// 시간 : 136 ms