package BOJ.stage04_while문;

import java.io.*;

public class _02_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String str;

        /*
            charAt(int index)는 아스키코드 값을 반환한다.
            입력값 A와 B는 항상 10보다 작으므로 인덱스가 동일하다.
            ex. 1 2
            1 -> 0(index)
            " " -> 1(index)
            2 -> 2(index)

            readLine()을 while()조건에 위치시키지 않고,
            위에 선언한 String 참조변수에 담아 사용하면,
            무한루프가 되어 메모리초과가 발생한다.
        */

        while ((str = br.readLine()) != null) {
            int A = str.charAt(0) - 48;
            int B = str.charAt(2) - 48;

            result.append(A + B).append("\n");
        }
        br.close();
        System.out.println(result);
    }
}

// 메모리 : 14144 KB
// 시간 : 124 ms