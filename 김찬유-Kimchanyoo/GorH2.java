import java.util.Scanner;
/*
의사코드
1. 사람의 수 N을 입력받는다
2. 각 사람들이 서있는 위치와 팻말의 알파벳을 입력받는다
3. 입력받은 알파벳이 G이면 0~99까지의 위치가 저장되어 있는 배열의 위치에 값의 1로 바꾼다
    3-1. 입력받은 알파벳이 H이면 -1로 바꾼다
4. 만약 입력받은 사람의 수가 1이면 0을 출력한다
5. 0부터 99까지 위치를 완전탐색하여 가장 큰 사진의 크기를 측정하는 함수를 사용한다
    5-1. i의 범위는 0 ~ MAX_NUM - 1, j의 범위는 i + 1 ~ MAX_NUM, k의 범위는 i ~ j + 1으로 정해서 반복한다
    5-2. 배열의 i번째 값이나 j번째 값이 0이라면 다음 범위를 보기 위해 continue를 사용한다
    5-3. G의 수와 H의 수를 0으로 초기화한다
    5-4. G의 수와 H의 수를 배열의 값이 무엇인지를 검사해보면서 구한다
    5-5. 오로지 G 혹은 H로만 이루어져 있거나, G와 H가 정확히 같은 개수라면 j에서 i를 뺀 거리를 len으로 하고
     이와 maxLen을 비교하여서 큰값을 저장해둔다
6. maxLen을 출력한다
 */
public class GorH2 {
    static final int MAX_NUM = 100;
    static Scanner sc = new Scanner(System.in);
    static int[] locationList = new int[MAX_NUM];
    static int cnt_G = 0;
    static int cnt_H = 0;
    static int maxLen = 0;
    public static void main(String[] args){
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int location = sc.nextInt();
            String alpha = sc.next();
            if(alpha.equals("G")){
                locationList[location - 1] = 1;
            }
            else{
                locationList[location - 1] = -1;
            }
        }
        // 만약 사람의 수가 1이면 0을 출력함
        if(N == 1){
            System.out.println(0);
            return;
        }

        calculateMaxLength();

        System.out.println(maxLen);
    }
    /**
     * 오로지 G 혹은 H로만 이루어져 있거나, G와 H가 정확히 같은 개수만큼 나오는 최대 거리를 측정하는 함수
     */
    private static void calculateMaxLength() {
        for(int i = 0; i < MAX_NUM - 1; i++){
            for(int j = i + 1; j < MAX_NUM; j++){
                if(locationList[i] == 0 || locationList[j] == 0){
                    continue;
                }
                cnt_G = 0;
                cnt_H = 0;
                for(int k = i; k < j + 1; k++){
                    if(locationList[k] == 1){
                        cnt_G++;
                    }
                    if(locationList[k] == -1){
                        cnt_H++;
                    }
                }
                if(cnt_G == 0 || cnt_H == 0 || cnt_G == cnt_H){
                    int len = j - i;
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
    }
}