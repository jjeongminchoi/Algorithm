package BOJ.stage12_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _05_1764 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nm = new StringTokenizer(bufferedReader.readLine(), " ");
        StringBuilder result = new StringBuilder();

        int N = Integer.parseInt(nm.nextToken()); // 듣지도 못한 사람 수
        int M = Integer.parseInt(nm.nextToken()); // 보지도 못한 사람 수
        int cnt = 0; // 듣보잡 수

        Set<String> noListen = new HashSet<>();
        List<String> noListenNoSee = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            noListen.add(bufferedReader.readLine());
        }

        for (int i = 0; i < M; i++) {
            String noSee = bufferedReader.readLine();
            if (noListen.contains(noSee)) {
                noListenNoSee.add(noSee);
                cnt++;
            }
        }

        Collections.sort(noListenNoSee);
        result.append(cnt).append("\n");
        for (String res : noListenNoSee) {
            result.append(res).append("\n");
        }

        System.out.println(result);

        bufferedReader.close();
    }
}

// 메모리 : 26596 KB
// 시간 : 324 ms