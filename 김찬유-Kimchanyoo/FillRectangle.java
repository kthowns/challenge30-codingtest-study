import java.util.Scanner;
/*
의사코드
1. 행의 크기 N, 열의 크기 M을 입력받는다
2. 이중배열 map을 N * M의 크기로 만든다
3. number가  N * M크기를 넘지 않을 때까지 반복한다
    3-1. 상하좌우로 움직이는 for문을 각각 만든다
    3-2. 하로 움직이는 for문을 예로 들면 이중배열이므로 x값은 그대로 두고 y값을 수정하기 위해 map[++y][x] = number++;로 할당을 한다
    이때 하로 움직이는 범위는 height보다 크기가 경우로 본다
    3-3. 나머지 부분도 다음과 같은 로직으로 작성한다
4. 완성된 map배열을 N * M형태로 출력한다
*/
public class FillRectangle {
    static Scanner sc = new Scanner(System.in);
    static int[][] map;
    static int number = 1;
    static int y = -1;
    static int x = -0;
    static int height, width;

    public static void main(String[] args) {

        int N = sc.nextInt();
        int M = sc.nextInt();
        map = new int[N][M];

        calulateMap(N, M);

        printMap(N, M);
    }
    /**
     * n * m 배열을 계산하는 함수
     * @param N 행
     * @param M 열
     */
    private static void calulateMap(int N, int M) {
        width = M - 1;
        height = N;
        while(number <= (N * M)) {
            // 하로 이동
            for (int i = 0; i < height; i++) {
                map[++y][x] = number++;
            }
            height--;

            // 우로 이동
            for (int i = 0; i < width; i++) {
                map[y][++x] = number++;
            }
            width--;

            // 상으로 이동
            for (int i = 0; i < height; i++) {
                map[--y][x] = number++;
            }
            height--;

            // 좌로 이동
            for (int i = 0; i < width; i++) {
                map[y][--x] = number++;
            }
            width--;
        }
    }
    /**
     * 완성된 배열을 출력
     * @param N 행
     * @param M 열
     */
    private static void printMap(int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}