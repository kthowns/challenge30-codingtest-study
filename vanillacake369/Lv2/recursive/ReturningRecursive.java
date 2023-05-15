import java.util.Scanner;

public class ReturningRecursive {
    public static void main(String[] args) throws Exception {
        /* 입력 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 수 개수
        int[] inputNumArr = new int[n]; // 입력 수 배열
        for (int i = 0; i < inputNumArr.length; i++) {
            inputNumArr[i] = scanner.nextInt();
        }

        /* 연산 */
        int lastCommonMult = getLastCommonMult(inputNumArr);

        /* 출력 */
        System.out.println(lastCommonMult);

        scanner.close();
    }

    /**
     * 최대공배수 구하는 함수
     * 
     * @의사코드
     *       그냥 모든 수가 1이 될때까지 나누기
     *       1. 나눔수 설정하기 :: 2 ~ 10 사이에서 하나라도 나눌 수 있는 값 중 최소값을 나눔수로 설정한다.
     *       2. 나누기 :: 각 수를 나눔수로 나눌 수 있다면 나눈다.
     *       3. 나누기 :: 각 수를 나눔수로 나눌 수 없다면 나누지 않는다.
     *       4. 재귀호출 :: 각 수가 1이 될 때까지 1~3단계를 반복한다.
     * 
     * @param n
     * @param inputNumArr
     * @return
     */
    private static int getLastCommonMult(int[] inputNumArr) {
        // 1. 나눔수 설정하기
        int divider = getDividerMin(inputNumArr);

        for (int j = 0; j < inputNumArr.length; j++) {
            // 2. 각 수를 나눔수로 나눌 수 없다면 나누지 않는다.;
            if (inputNumArr[j] % divider != 0) {
                continue;
            }
            // 3. 각 수를 나눔수로 나눌 수 있다면 나눈다.
            inputNumArr[j] = inputNumArr[j] / divider;
        }

        // 4. 각 수가 1이 될 때까지 1~2단계를 반복한다.
        if (isAllNumEqualsOne(inputNumArr)) {
            return divider;
        }

        return (divider * getLastCommonMult(inputNumArr));
    }

    /**
     * 나눔수 설정하기 :: 2~10 사이에서 하나라도 나눌 수 있는 값 중 최소
     * 
     * @param inputNumArr
     * @return
     */
    private static int getDividerMin(int[] inputNumArr) {
        int divider = 0;
        for (int i = 2; i <= 10; i++) {
            for (int j = 0; j < inputNumArr.length; j++) {
                // 나눠지지 않는다면 다음 수 비교
                if (inputNumArr[j] % i == 0) {
                    return i;
                }
            }
        }
        return divider;
    }

    /**
     * 모든 수가 1이면 참을 반환하는 함수
     * 
     * @param inputNumArr
     * @return
     */
    private static boolean isAllNumEqualsOne(int[] inputNumArr) {
        for (int i = 0; i < inputNumArr.length; i++) {
            if (inputNumArr[i] != 1)
                return false;
        }
        return true;
    }
}
