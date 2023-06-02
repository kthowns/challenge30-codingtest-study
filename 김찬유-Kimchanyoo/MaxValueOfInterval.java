import java.util.Scanner;
/*
의사코드
1. 숫자의 갯수 n과 계산할 숫자의 범위 k를 입력받는다
2. 이중 for문을 이용하여서 각각 범위에서 합을 구한다
    2-1. 각 구간에서의 합을 구할 때마다 직전 값과 비교하여 더 큰 값을 저장한다
    2-2. 단, 첫번째 비교에서는 직전 값이 없으므로 직전 값의 초기값을 Interger.MIN_VALUE로 정해둔다
3. 반복이 끝난 이후 가장 큰 최댓값을 출력한다
 */
public class MaxValueOfInterval {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_RANGE = 100;
    static int previousValue = Integer.MIN_VALUE;
    static int[] numberList = new int[MAX_RANGE];
    public static void main(String[] args){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int resultMaxNumber = 0;
        for(int i = 0; i < n; i++){
            numberList[i] = sc.nextInt();
        }

        calculateMaxValue(n, k);

        // 결과값을 출력할 변수에 집어넣음
        resultMaxNumber = previousValue;

        System.out.println(resultMaxNumber);
    }

    /**
     * 구간 중 최대 합을 구하는 함수
     * @param n 숫자의 갯수
     * @param k 계산할 숫자의 범위
     */
    private static void calculateMaxValue(int n, int k) {
        for(int i = 0; i < n - k + 1; i++){
            int calculateValue = 0;
            for(int j = i; j < i + k; j++){
                calculateValue = calculateValue + numberList[j];
            }
            previousValue = Math.max(calculateValue, previousValue);
        }
    }
}
