import java.util.Scanner;

public class CallBy {
    public static void main(String[] args) {
        /* input */
        Scanner scanner = new Scanner(System.in);
        String[] inputStr = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputStr[0]);
        int b = Integer.parseInt(inputStr[1]);

        /* calc */
        int[] result = computeTwoInt(a, b);

        /* result */
        System.out.println((result[0]) + " " + (result[1]));
    }

    /**
     * 의사코드
     * 1. 두 개짜리의 배열 생성
     * 2. 입력 a,b 비교
     * 2-1. a가 크다면 :: 배열의 0 번째에 a*2, 1번째에 b+10 저장
     * 2-2. b가 크다면 :: 배열의 0 번째에 a+10, 1번째에 b*2 저장
     * 3. 배열 반환
     */
    private static int[] computeTwoInt(int a, int b) {
        int[] temp = new int[2];

        if (a > b) {
            temp[0] = a * 2;
            temp[1] = b + 10;
        } else {
            temp[0] = a + 10;
            temp[1] = b * 2;
        }

        return temp;
    }
}
