import java.util.Scanner;
/*
의사코드
1. N * N 크기의 정사각형의 크기 N을 입력받는다
2. 명령어의 크기 T를 입력받는다
3. 명령어를 분할하여 String배열로 넣는다
4. N * N 크기의 정사각형의 각 좌표의 값을 입력받는다
5. 이동경로의 모든 숫자의 합을 위해 x와 y의 첫 시작 지점을 sumNumber에 더한다
6. R일 때와 L일 때의 경우를 d를 계산한다
7. x와 y의 값을 계산하고 이 값이 범위안에 들어가는지 확인한다
   7-1. 범위안에 들어가면 실제 x값과 y값을 계산하고 sumNumber를 더한다
8. sumNumber를 계산한다
 */
public class AddNumber {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_NUMBER = 100;
    static int N, sumNumber;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map = new int[MAX_NUMBER][MAX_NUMBER];

    public static void main(String[] args){
        N = sc.nextInt();
        int T = sc.nextInt();
        sc.nextLine();
        String movingCommand = sc.nextLine();
        String[] commandList = new String[T];
        commandList = movingCommand.split("");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                map[i][j] = sc.nextInt();
            }
        }
        int x = N / 2;
        int y = N / 2;
        int d = 0;
        sumNumber = map[x][y];
        for (String c : commandList) {
            if (c.equals("R")) {
                d = (d + 1) % 4;
            } else if (c.equals("L")) {
                d = (d + -1) % 4;
                if(d < 0){
                    d = d + 4;
                }
            } else {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (inRange(nx, ny)) {
                    x = x + dx[d];
                    y = y + dy[d];
                    sumNumber = sumNumber + map[x][y];
                }
            }
        }
        System.out.println(sumNumber);
    }
    /**
     * N * N 범위안에 움직임이 들어가는지 알아내기 위한 함수
     * @param x x의 범위
     * @param y y의 범위
     * @return x와 y의 범위 안에 있으면 true로 하고 아니면 false를 반환
     */
    private static boolean inRange(int x, int y){
        return 0 <= x && x < N && 0 <= y && y < N;
    }
}