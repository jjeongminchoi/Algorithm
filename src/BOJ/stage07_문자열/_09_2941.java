package BOJ.stage07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _09_2941 {
    public static void main(String[] args) throws IOException {
        String regex = "^[a-z-=]*${1,100}";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = bufferedReader.readLine();

        if (inputStr.matches(regex)) {
            int count = 0;
            int length = inputStr.length();

            for (int i = 0; i < length; i++) {
                char ch = inputStr.charAt(i);

                if (ch == 'c' && i < length - 1) {
                    if (inputStr.charAt(i + 1) == '-' || inputStr.charAt(i + 1) == '=') {
                        i++;
                    }
                } else if (ch == 'd' && i < length - 1) {
                    if (inputStr.charAt(i + 1) == 'z' && i < length - 2) {
                        if (inputStr.charAt(i + 2) == '=') {
                            i += 2;
                        }
                    } else if (inputStr.charAt(i + 1) == '-') {
                        i++;
                    }
                } else if ((ch == 'l' || ch == 'n') && i < length - 1) {
                    if (inputStr.charAt(i + 1) == 'j') {
                        i++;
                    }
                } else if ((ch == 's' || ch == 'z') && i < length - 1) {
                    if (inputStr.charAt(i + 1) == '=') {
                        i++;
                    }
                }

                count++;
            }

            System.out.println(count);
        } else {
            System.out.println("표현식이 맞지 않습니다.");
        }

        bufferedReader.close();
    }
}

// 메모리 :  KB
// 시간 :  ms
