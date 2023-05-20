import java.util.Scanner;
/*
의사코드
1. 방의 갯수 n을 정한다
2. 방마다 최대 정원을 정해준다
3. 몇번째 방에서 출발하는지에 따라 거리별 계산을 해준다
    3-1. 만약 3번 방에서 출발하면 2번은 거리가 4가 되야하고 5번은 거리가 2가되야한다
         이를 위해 계산 (count * 방의 사람수}을 해준다
         단, n - 거리별 계산을 하는 방의 번호를 count라고 한다
         여기서 유의할 점은 계산 count가 n이 나오게 되면 
         count를 다시 1로 바꿔주고 계산을 진행한다
    3-2. 방마다 계산이 끝날때마다 가장 짧은 거리인지 비교해 가장 짧은 거리를 minDistance에 저장해둔다
4. 가장 짧은 거리를 출력한다    
 */
public class CircleRoom {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    static int movesum = 0;
    static int minDistance = Integer.MAX_VALUE;
    public static void main(String[] args){
        int n = sc.nextInt();
        int[] roomMember = new int[n];
        for(int i = 0; i < n; i++){
            roomMember[i] = sc.nextInt();
        }

        distanceCalculate(n, roomMember);

        System.out.println(minDistance);
    }

    /**
     * 시작위치별 이동 거리 합을 구하는 함수
     * @param n 방의 갯수
     * @param roomMember 방마다 최대 정원
     */
    private static void distanceCalculate(int n, int[] roomMember) {
        for(int i = 0; i < n; i++){
            count = n - i;
            movesum = 0;
            for(int j = 0; j < n; j++){
                if(count == n){
                    count = 1;
                }
                else {
                    movesum += roomMember[j] * count;
                    count++;
                }
            }
            if(minDistance > movesum){
                minDistance = movesum;
            }
        }
    }
}
