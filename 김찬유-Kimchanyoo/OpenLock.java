import java.util.Scanner;
/*
의사코드
1. 자물쇠 숫자의 수 n을 입력한다
2. 자물쇠의 조합을 배열에 저장한다
3. 자물쇠가 열리는 경우의 수를 계산하는 함수를 실행한다
    3-1. for문을 3중으로 실행한다
        3-1-1. i의 범위는 1 ~ n + 1, j의 범위는 1 ~ n + 1, k의 범위는 1 ~ n + 1으로 정해서 반복한다
        3-1-2. 자물쇠 첫번째 정답과 i를 뺀 값의 절대값이 2이하이거나,
         자물쇠 두번째 정답과 j를 뺀 값의 절대값이 2이하이거나,
         자물쇠 세번째 정답과 k를 뺀 값의 절대값이 2이하라면 열리는 경우의 수를 1증가시킨다
4. 자물쇠가 열리는 경우의 수를 출력한다
 */
public class OpenLock {
    static final int LOCK_PASSWORD = 3;
    static Scanner sc = new Scanner(System.in);
    static int[] target = new int[LOCK_PASSWORD];
    static int unlock_count = 0;
    public static void main(String[] args){
        int n = sc.nextInt();
        for(int i = 0; i < LOCK_PASSWORD; i++){
            target[i] = sc.nextInt();
        }
        calculateLock(n);

        System.out.println(unlock_count);
    }

    /**
     * 자물쇠가 열리는 경우의 수를 계산하는 함수
     * @param n 자물쇠 숫자의 수
     */
    private static void calculateLock(int n) {
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < n + 1; j++){
                for(int k = 1; k < n + 1; k++){
                    if(Math.abs(target[0] - i) <= 2 || Math.abs(target[1] - j) <= 2 || Math.abs(target[2] - k) <= 2){
                        unlock_count++;
                    }
                }
            }
        }
    }
}
