package vanillacake369.Lv2.brute_force_1;

import java.util.Scanner;

public class PairParentheses2 {

    private static final Scanner scanner = new Scanner(System.in);
    private static char[] inputList = new char[100];

    /**
     * 의사코드
     * 
     * 1. 첫 인덱스부터 끝까지의 루프 간에 :: i
     *      1-1. i+2부터 끝까지의 루프간에 :: j
     *          1-1-a. i번째에 (이 등장 && i+1번째에 (이 등장 
     *              && j번째에 )이 등장 && j+1번째에 )이 등장한다면
     *              1-1-a-i. 쌍의 개수 증가
     * 
     * 2. 쌍의 개수 출력
     */
    public static void main(String[] args) {

        /* 입력 */
        String inputStr = scanner.next();
        int inputLength = inputStr.length();
        for (int i = 0; i < inputStr.length(); i++) {
            inputList[i] = inputStr.charAt(i);
        }

        /* 연산 */
        int countPair = 0;
        for (int i = 0; i < inputLength; i++)
            for (int j = i + 2; j < inputLength; j++)
                if ((inputList[i] == '(') && (inputList[i + 1] == '(')
                        && (inputList[j] == ')') && (inputList[j + 1] == ')'))
                    countPair++;

        /* 출력 */
        System.out.println(countPair);

    }
}
