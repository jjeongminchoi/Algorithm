package BOJ.stage07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String regExp = "^[a-z]*$"; // a~z 정규식
        String S = br.readLine(); // 문자열 입력

        // 입력받은 문자열이 소문자인지 체크 후 실행
        if (S.matches(regExp)) {
            int[] arr = new int[26]; // 소문자 갯수
            int asciiCode_a = "a".charAt(0); // 'a' 의 아스키코드 구하기

            // arr 배열에 -1로 값 초기화
            for (int i = 0 ; i < arr.length ; i++) {
                arr[i] = -1;
            }

            /*
                1. 입력한 문자열의 길이만큼 반복한다. (i 는 문자의 위치)
                2. 문자열의 각각의 문자의 아스키코드를 구한다.
                3. 앞서 구한 문자의 아스키코드에서 문자 'a'의 아스키코드를 뺀다.
                    ex) 97 - 97 = 0 --> 'a'
                        98 - 97 = 1 --> 'b'
                4. 뺀 결과 값을 인덱스로 활용하여 i의 값을 초기화시킨다.
                5. arr[alphabetIndex] 값이 -1 일 때만 초기화를 한다 (중복방지)
            */
            for (int i = 0 ; i < S.length() ; i++) {
                int s = S.charAt(i);
                int alphabetIndex = s - asciiCode_a;

                if (arr[alphabetIndex] == -1) {
                    arr[alphabetIndex] = i;
                }
            }

            for (int j : arr) {
                result.append(j).append(" ");
            }

            System.out.println(result);

        } else {
            System.out.println("소문자만 입력 가능합니다. 다시 입력해주세요");
        }

        br.close();
    }
}

// 메모리 : 14356 KB
// 시간 : 132 ms