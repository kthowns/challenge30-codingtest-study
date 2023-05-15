import java.util.Scanner;
/*
의사코드
1. N을 입력받는다
2. N의 수만큼 방향과 거리를 입력받는다
3. 방향을 비교하면서 dx, dy 테크닉을 사용한다
4. x좌표와 y좌표를 출력한다
 */
public class MoveDirection {
    static Scanner sc = new Scanner(System.in);
    static int[] dx = new int[]{1,  0, -1, 0};
    static int[] dy = new int[]{0, -1,  0, 1};
    static int x = 0;
    static int y = 0;
    static int dirNum;
    public static void main(String[] args){
        int n = sc.nextInt();

        inputDistance(n);

        printCordinate(x, y);
    }

    /**
     * 방향과 움직이는 거리를 입력받는 함수
     */
    private static void inputDistance(int n) {
        for(int i = 0; i  < n; i++) {
            String direction = sc.next();
            int distance = sc.nextInt();
            calculateCordinate(direction, distance);
        }
    }

    /**
     * 방향에 따라 좌표를 이동하는 것을 계산하는 함수
     */
    private static void calculateCordinate(String direction, int distance) {
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

        x = x + dx[dirNum] * distance;
        y = y + dy[dirNum] * distance;
    }
    /**
     * 좌표를 출력하는 함수
     */
    private static void printCordinate(int x, int y) {
        System.out.println(x + " " + y);
    }
}
