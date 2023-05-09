import java.util.*;
/*
의사코드
1. 그룹의 갯수를 정하는 n을 입력받는다
2. 배열을 입력받는다
3. calcMax()함수에서 배열을 정렬해준다
4. 배열의 i번째 값과 배열의 크기 - i 번째 값을 더해서 임시 배열에 더한다
5. 임시 배열의 최댓값을 구해서 출력한다
 */

public class GroupByTwoMembers {
    public static void main(String[] args){
        // 입력부
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numList = new ArrayList<Integer>(2*n);
        for(int i = 0; i < n * 2; i++) {
            numList.add(sc.nextInt());
        }
        // 연산부
        int max = calcMax(numList, 2 * n);
        // 출력부
        printMax(max);
    }

    /**
     * 숫자 배열과 배열의 크기를 받아 배열의 최댓값을 반환하는 함수
     * @author 김찬유
     */
    private static int calcMax(List<Integer> list, int size){
        Collections.sort(list);
        // 배열 그룹의 합을 임시로 저장해둘 배열
        ArrayList<Integer> tempList = new ArrayList<Integer>(size/2 - 1);
        // 배열의 크기를 저장할 변수
        int endOfListSize = size;
        for(int i = 0; i < size - 1; i++){
            tempList.add(list.get(i) + list.get(endOfListSize-1));
            endOfListSize--;
        }
        return Collections.max(tempList);
    }

    /**
     * 최댓값을 출력하는 함수
     * @author 김찬유
     */
    private static void printMax(int max){
        System.out.println(max);
    }
}
