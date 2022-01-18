package BOJ.stage06_함수;

public class _02_4673 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        // 생성자 숫자를 계산하는 클래스의 인스턴스를 생성한다.
        Constructor c = new Constructor();

        // 해당하는 생성자를 체크하기 위한 boolean 타입의 배열을 선언한다.
        boolean[] check = new boolean[10001];

        // constructor(inn n) 메서드를 이용해 생성자 숫자를 얻은 후 생성자 숫자가 10001보다 작다면,
        // 해당 숫자를 인덱스로 활용해 check 배열에 true 로 초기화시킨다.
        for (int i = 1 ; i < 10001 ; i++) {
            int n = c.constructor(i);

            if (n < 10001) {
                check[n] = true;
            }
        }

        // 생성자 숫자의 결과가 0일 경우는 없으므로 1부터 시작해 10000까지 반복하도록 하고,
        // check 배열의 값이 false(셀프넘버) 인 인덱스의 값만 출력한다.
        for (int i = 1 ; i < check.length ; i++) {
            if (check[i] == false) {
                result.append(i).append("\n");
            }
        }
        System.out.println(result);
    }
}

class Constructor {
    int constructor (int n) {
        int constructorNum = n;

        // 매개변수로 받은 숫자의 각각의 자릿수를 더하기 위해 toString()을 이용해 string 으로 변환한다.
        String stringNum = Integer.toString(n);
        for (int i = 0 ; i < stringNum.length() ; i++) {
            // 각 자릿수의 인덱스의 값을 구해 누적시킨다.
            constructorNum += stringNum.charAt(i) - '0';
        }
        return constructorNum;
    }
}

// 메모리 : 14992 KB
// 시간 : 136 ms