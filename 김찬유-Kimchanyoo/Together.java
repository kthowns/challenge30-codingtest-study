import java.util.Arrays;
import java.util.Scanner;
/*
의사코드
1. 집의 개수 n을 입력받는다
2. 집 각각의 거주 인원을 입력받는다
3. 거리별로 이동거리의 합을 구한다
    3-1. 예로 1번째 집을 온다고 할 때 각 집의 인원수 * (각 집의 위치 - 1)을 다 더해준다
4. 거리별 더한 결과를 정렬하여서 1번째, 즉 배열의 0번째 인덱스에 있는 값을 출력한다
 */
public class Together {
    static Scanner sc = new Scanner(System.in);
    static int i;
    public static void main(String[] args){
        int n = sc.nextInt();
        int[] houses = new int[n];
        int[] distance = new int[n];
        distance[0] = 0;
        for(i = 0; i < n; i++){
            houses[i] = sc.nextInt();
        }

        calculateDistance(n, houses, distance);
        
        // 이동거리의 합이 들어간 배열을 오름차순으로 정렬
        Arrays.sort(distance);
        
        printMinValue(distance);
    }
    /**
     * 이동거리를 계산하는 함수
     * @param n 집의 갯수
     * @param houses 집마다 사는 사람들의 수
     * @param distance 이동 거리의 합이 들어있는 배열
     */
    private static void calculateDistance(int n, int[] houses, int[] distance) {
        for(i = 0; i < n; i++){
            int move = 1;
            for(int j = 0; j < n; j++){
                distance[i] = distance[i] + houses[j] * Math.abs((i+1)-move);
                move++;
            }
        }
        
    }
    /**
     * 이동 거리의 합의 최솟값을 출력하는 함수
     * @param distance 이동 거리의 합이 들어있는 배열
     */
    private static void printMinValue(int[] distance) {
        System.out.println(distance[0]);
    }
}
