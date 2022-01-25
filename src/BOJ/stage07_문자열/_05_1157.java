package BOJ.stage07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String regExp = "^[a-zA-Z]*$";
        String word = br.readLine();
        int wordMaxLength = 1000000;

        if (word.matches(regExp)) {
            if (word.length() <= wordMaxLength) {
                String result = checkingWord(word);
                System.out.println(result);
            } else {
                System.out.println("단어의 길이가 너무 큽니다.");
            }
        } else {
            System.out.println("알파벳만 입력해주세요.");
        }
        br.close();
    }

    private static String checkingWord(String word) {
        String result = "";
        String[] wordArr = word.split("");
        int asciiCode_A = "A".charAt(0);
        int[] alphabet = new int[26];
        int searchMaxValueIndex = 0;
        boolean overlapMaxValue = false;

        for (int i = 0 ; i < wordArr.length ; i++) {
            int wordToUpperCase = wordArr[i].toUpperCase().charAt(0);
            alphabet[wordToUpperCase - asciiCode_A]++;
        }

        for (int j = 1 ; j < alphabet.length ; j++) {
            if (alphabet[searchMaxValueIndex] <= alphabet[j]) {
                if (alphabet[searchMaxValueIndex] == alphabet[j]) {
                    overlapMaxValue = true;
                } else if (alphabet[searchMaxValueIndex] < alphabet[j]) {
                    searchMaxValueIndex = j;
                    overlapMaxValue = false;
                }
            }

            if (overlapMaxValue) {
                result = "?";
            } else {
                char ch = (char) (searchMaxValueIndex + asciiCode_A);
                result = Character.toString(ch);
            }
        }
        return result;
    }
}

// 메모리 : 109392 KB
// 시간 : 616 ms