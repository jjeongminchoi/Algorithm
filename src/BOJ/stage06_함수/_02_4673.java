package BOJ.stage06_함수;

import java.io.*;

public class _02_4673 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Constructor c = new Constructor();

        int n = 1;
        int constructorNum = c.constructor(n);

        System.out.println(constructorNum);
//        for (int i = 0 ; i < 10000 ; i++) {
//            if (i != constructorNum) {
////                bw.write(i);
//                System.out.println(i);
//            }
//        }
//        bw.close();
    }
}

class Constructor {
    int constructor (int n) {
        int constructorNum = n;

        String stringNum = Integer.toString(n);
        for (int i = 0 ; i < stringNum.length() ; i++) {
            constructorNum += stringNum.charAt(i) - '0';

            if (constructorNum <= 10000) {
                return constructorNum;
            }
        }
        return constructor(constructorNum);
    }
}

// 메모리 : 422968 KB
// 시간 : 24 ms
