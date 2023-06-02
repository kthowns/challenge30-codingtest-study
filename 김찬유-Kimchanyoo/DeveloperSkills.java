import java.util.Scanner;
/*
의사코드
1. 개발자 6명의 알고리즘 능력을 배열에 입력받는다
2. 그룹간 차이가 최소인 값을 찾는 함수를 실행한다
    2-1. for문을 3중으로 사용한다
        2-1-1. i의 범위는 0 ~ 6, j의 범위는 i + 1 ~ 6, k의 범위는 j + 1 ~ 6으로 정해서 반복한다
    2-2. 2그룹으로 나눈 것의 능력의 총합간의 차를 구한다
        2-2-1. 1그룹의 합을 구하고 6명 모두의 합에서 1그룹의 합을 빼면 1, 2그룹의 능력의 총합을 얻을 수 있다
        2-2-2. 1그룹의 합에서 2그룹의 합을 뺀 값의 절대값을 반환한다
        2-2-3. 능력의 총합간 차이와 이전 차이 중 최솟값을 minValue에 할당한다
3. minValue를 출력한다
 */
public class DeveloperSkills {
    static final int MAX_DEVELOPER = 6;
    static int minValue = Integer.MAX_VALUE;
    static Scanner sc = new Scanner(System.in);
    static int[] developers = new int[MAX_DEVELOPER];
    public static void main(String[] args){
        for(int i = 0; i < MAX_DEVELOPER; i++){
            developers[i] = sc.nextInt();
        }

        calculateMinDiff();

        System.out.println(minValue);
    }
    /**
     * 그룹간 차이가 최소인지 확인하는 함수
     */
    private static void calculateMinDiff() {
        for(int i = 0; i < MAX_DEVELOPER; i++){
            for(int j = i + 1; j < MAX_DEVELOPER; j++){
                for(int k = j + 1; k < MAX_DEVELOPER ; k++){
                    minValue = Math.min(minValue, getDiff(i, j, k));
                }
            }
        }
    }
    /**
     * 그룹간 능력 총합의 차이를 구하는 함수
     * @param developer1 첫 번째 개발자의 능력
     * @param developer2 두 번째 개발자의 능력
     * @param developer3 세 번째 개발자의 능력
     * @return 그룹간 능력 총합의 차이
     */
    private static int getDiff(int developer1, int developer2, int developer3){
        int sum1 = developers[developer1] + developers[developer2] + developers[developer3];
        int sum2 = 0;
        for(int i = 0; i < MAX_DEVELOPER; i++){
            sum2 += developers[i];
        }
        sum2 -= sum1;
        return Math.abs(sum1 - sum2);
    }
}
