package BOJ.stage07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int inputLen = input.length();
        int minTime = 0;

        if (2 <= inputLen && inputLen <= 15) {
            for (int i = 0 ; i < inputLen ; i++) {
                char dial = input.charAt(i);
                switch (dial) {
                    case 'A': case 'B': case 'C':
                        minTime += 3;
                        break;
                    case 'D': case 'E': case 'F':
                        minTime += 4;
                        break;
                    case 'G': case 'H': case 'I':
                        minTime += 5;
                        break;
                    case 'J': case 'K': case 'L':
                        minTime += 6;
                        break;
                    case 'M': case 'N': case 'O':
                        minTime += 7;
                        break;
                    case 'P': case 'Q': case 'R': case 'S':
                        minTime += 8;
                        break;
                    case 'T': case 'U': case 'V':
                        minTime += 9;
                        break;
                    case 'W': case 'X': case 'Y': case 'Z':
                        minTime += 10;
                        break;
                }
            }
            System.out.println(minTime);
        } else {
            System.out.println("단어가 짧거나 깁니다");
        }
    }
}

// 메모리 : 14200 KB
// 시간 : 128 ms