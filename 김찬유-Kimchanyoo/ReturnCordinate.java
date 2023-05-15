import java.util.Scanner;

/*
의사코드
1. n을 입력받는다
2. N의 수만큼 방향과 거리를 입력받는다
3. 방향을 비교하면서 dx, dy 테크닉을 사용한다
4. boolean 변수가 false일 경우 방향에 따라 이동을 진행하면서 count를 1개씩 증가시킨다
    4-1. 진행할때 원점으로 돌아오는 경우 boolean 변수를 True로 변환한다
4. count를 출력한다
 */
public class ReturnCordinate {
    static Scanner sc = new Scanner(System.in);
    static int[] dx = new int[]{1,  0, -1, 0};
    static int[] dy = new int[]{0, -1,  0, 1};
    static int x = 0;
    static int y = 0;
    static int dirNum, count = 0;
    static boolean returning = false;
    public static void main(String[] args){
        int n = sc.nextInt();

        inputDistance(n);

        printCount();
    }

    /**
     * 방향과 움직이는 거리를 입력받는 함수
     */
    private static void inputDistance(int n) {
        for(int i = 0; i  < n; i++) {
            String direction = sc.next();
            int distance = sc.nextInt();

            calculateDirection(direction, distance);

            calculateDirection(distance);
        }
    }
    /**
     * 이동하는 방향을 설정하는 함수
     */
    private static void calculateDirection(String direction, int distance) {
        if(direction.equals("E")){
            dirNum = 0;
        }
        else if(direction.equals("S")){
            dirNum = 1;
        }
        else if(direction.equals("W")){
            dirNum = 2;
        }
        else if(direction.equals("N")){
            dirNum = 3;
        }
        else{
            return;
        }
    }
    /**
     * boolean 변수가 false일 경우 방향에 따라 이동을 진행하고
     * 진행할때 원점으로 돌아오는 경우 boolean 변수를 True로 만드는 함수
     */
    private static void calculateDirection(int distance) {
        if(returning){
            return;
        }
        else{
            for(int j = 0; j < distance; j++){
                x = x + dx[dirNum];
                y = y + dy[dirNum];
                count++;
                if(x == 0 && y == 0){
                    returning = true;
                    break;
                }
            }
        }
    }
    /**
     * 좌표를 출력하는 함수
     */
    private static void printCount() {
        if(returning){
            System.out.println(count);
        }
        else{
            System.out.println(-1);
        }

    }
}
