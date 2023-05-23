import java.util.*;

/*
의사코드
1. 수열 A의 수 n과 수열 B의 수 m을 입력받는다
2. 수열 A와 수열 B를 입력받는다
3. 수열 B를 정렬한다
4. 반복문으로 아름다운 수열인지 판단한다
    4-1. 수열 A의 i부터 i + m만큼을 복사한다(깊은 복사로 슬라이싱)
    4-2. 복사한 배열을 정렬한다
    4-3. 복사한 배열과 수열 B가 같은지 비교한다
    4-4. 같다면 count를 하나 증가시킨다
    4-5. 복사한 배열을 0으로 초기화시킨다
5. count를 출력한다
 */
public class BeautifulSequence {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    public static void main(String[] args){
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] sequenceA = new int[n];
        int[] sequenceB = new int[m];
        int[] tempSequence;
        
        for(int i = 0; i < n; i++){
            sequenceA[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            sequenceB[i] = sc.nextInt();
        }
        
        Arrays.sort(sequenceB);

        calculatBeatifulSequence(n, m, sequenceA, sequenceB);
        
        System.out.println(count);
    }
    /**
     * 아름다운 배열이 몇개 있는지 확인하는 함수
     * @param n 배열 A의 크기
     * @param m 배열 B의 크기
     * @param sequenceA 배열 A
     * @param sequenceB 배열 B
     */
    private static void calculatBeatifulSequence(int n, int m, int[] sequenceA, int[] sequenceB) {
        int[] tempSequence;
        for(int i = 0; i < n - m + 1; i++){
            tempSequence = copySequenceSlicing(m, sequenceA, i);
            if(Arrays.equals(tempSequence, sequenceB)){
                count++;
            }
            // 복사한 배열을 0으로 초기화
            Arrays.fill(tempSequence, 0);
        }
    }
    /**
     * 배열 A에서 배열 슬라이싱한 부분을 복사하고 정렬하는 함수
     * @param m 배열 B의 크기
     * @param sequenceA 배열 A
     * @param i 반복문의 변수
     * @return 복사하고 정렬된 배열
     */
    private static int[] copySequenceSlicing(int m, int[] sequenceA, int i) {
        int[] tempSequence;
        tempSequence = Arrays.copyOfRange(sequenceA, i, i + m);
        Arrays.sort(tempSequence);
        return tempSequence;
    }
}
