import java.util.Scanner;
import java.lang.Math;

/*
의사코드
1. 원소의 개수 n을 입력받는다
2. n만큼의 원소를 배열에 집어넣는다
3. 재귀함수 maxValue를 사용한다.
    3.1. 만약 n의 갯수가 0이라면 최대값으로 배열의 0번 인덱스값을 반환한다
    3.2. 만약 n의 갯수가 0이 아니라면 maxValue함수의 파라미터를 n-1로 주는 값과 배열 numList[n]의 값을 비교하여 큰값을 리턴한다.
*/
public class ReturningRecurisveForMaxValue {
    public static int[] numList;

    private static int maxValue(int num) {
        if (num == 0) {
            return numList[num];
        } else {
            return Math.max(maxValue(num - 1), numList[num]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numList = new int[n];
        for (int i = 0; i < n; i++) {
            numList[i] = sc.nextInt();
        }
        int max = maxValue(n - 1);
        System.out.println(max);
    }
}