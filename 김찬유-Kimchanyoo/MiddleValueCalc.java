import java.util.*;

/*
의사코드
1. n개의 수를 입력
2. 배열에 값 넣기
3. 횟수가 홀수인지 검사
    3-1. 홀수일시 정렬 후 중간 값 출력
    3-2. 짝수일시 continue함
 */
public class MiddleValueCalc {
    public static void main(String[] args) {
        // 입력부
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numList = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            numList.add(sc.nextInt());
        }
        // 연산 및 출력부
        printMiddleValue(numList);
    }

    /**
     * 배열 안의 값을 읽다가 홀수개마다 중간값을 출력하는 함수
     **/
    private static void printMiddleValue(List<Integer> list) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            tempList.add(list.get(i));
            if (i % 2 == 0) {
                Collections.sort(tempList);
                System.out.printf("%d ", tempList.get(i / 2));
            } else {
                continue;
            }
        }
    }
}
