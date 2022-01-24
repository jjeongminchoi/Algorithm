package BOJ.stage07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class _05_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String regExp = "^[A-Za-z]*$";
        String word = br.readLine();
        int wordLength = 1000000;

        if (word.matches(regExp)) {
            if (word.length() <= wordLength) {
                checkingWord(word);
            } else {
                System.out.println("단어의 길이가 너무 큽니다.");
            }
        } else {
            System.out.println("알파벳만 입력해주세요.");
        }
    }

    private static String checkingWord(String word) {
        String[] wordArr = word.split("");
        int asciiCode_a = "A".charAt(0);
        int[] alphabet = new int[26];

        for (int i = 0 ; i < wordArr.length ; i++) {
            int toUpperCase = wordArr[i].toUpperCase().charAt(0);
            alphabet[toUpperCase - asciiCode_a]++;
        }

        for (int j = 0 ; j < alphabet.length ; j++) {

        }

        String res = "a";
        return res;
    }
}

// 메모리 : 14256 KB
// 시간 : 132 ms