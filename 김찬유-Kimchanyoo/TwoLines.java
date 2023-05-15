import java.util.Scanner;
/*
의사코드
1. x값들을 4번 입력받아 배열에 집어넣는다
2. 4개의 x값들중 1, 2번째 값이 하나의 선분 3, 4번째 값을 하나의 선분으로 하여 겹치는지 여부를 검사한다
3. 겹치는 여부를 출력한다
 */
public class TwoLines {
    static final int MAX_SIZE = 100;
    static final int INPUT_VALUE = 4;
    static Scanner sc = new Scanner(System.in);
    static int[] x = new int[MAX_SIZE];
    static String output = "nonintersecting";
    public static void main(String[] args){
        inputPoint();
        checkintersecting();
        printintersecting();
    }
    /**
     * 겹쳤는지 여부를 출력하는 함수
     */
    private static void printintersecting() {
        System.out.println(output);
    }
    /**
     * 두 선이 겹치는지 확인하는 함수
     */
    private static void checkintersecting() {
        if(x[2] >= x[0] && x[2] <= x[1]){
            output = "intersecting";
        }
        else if(x[3] >= x[0] && x[3] <= x[1]){
            output = "intersecting";
        }
        else if(x[0] >= x[2] && x[0] <= x[3]){
            output = "intersecting";
        }
        else if(x[1] >= x[2] && x[1] <= x[3]){
            output = "intersecting";
        }
    }
    /**
     * x좌표들을 입력받는 함수
     */
    private static void inputPoint() {
        for(int i = 0; i < INPUT_VALUE; i++){
            x[i] = sc.nextInt();
        }
    }
}
