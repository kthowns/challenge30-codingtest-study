import java.util.Scanner;
/*
의사코드
1. 선분의 갯수 n을 입력한다
2. n개의 선분을 입력한다
    2-1. 선분을 입력할 때마다 시작점의 최댓값과 끝점의 최소값을 구한다
3. 만약 시작점의 최댓값이 끝점의 최솟값보다 크거나 같으면 전부 선분이 겹친다고 판단한다
4. 겹치는 여부를 출력한다
 */
public class IntersectingLine {
    static final int MAX_SIZE = 100;
    static Scanner sc = new Scanner(System.in);
    static String output = "No";
    static int x1, x2;
    static int maxStartPoint = 0;
    static int minEndPoint = MAX_SIZE;
    public static void main(String[] args){
        int n = sc.nextInt();

        inputPoint(n);
        checkintersecting();
        printintersecting();

    }
    /**
     * x좌표들을 입력받는 함수
     */
    private static void inputPoint(int number) {
        for(int i = 0; i < number; i++){
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            calculateCordinates();

        }
    }
    /**
     * 시작점의 최댓값과 끝점의 최소값을 구하는 함수
     */
    private static void calculateCordinates() {
        maxStartPoint = Math.max(x1, maxStartPoint);
        minEndPoint = Math.min(x2, minEndPoint);
    }
    /**
     * 선이 겹치는지 확인하는 함수
     */
    private static void checkintersecting() {
        if(maxStartPoint < minEndPoint){
            output = "Yes";
        }
    }
    /**
     * 겹쳤는지 여부를 출력하는 함수
     */
    private static void printintersecting() {
        System.out.println(output);
    }

}

