import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/*
의사코드
1. 개발자의 수 N, 전염시키는 악수의 횟수 K, 최초유포자 개발자 번호 P, 악수의 횟수 T를 입력받는다
2. T번동안 악수를 하는 시점 t, 개발자 x, 개발자 y을 plague 클래스 배열에 집어넣는다
3. 감염여부 배열을 생성한다
4. 악수 횟수 배열을 생성한다
5. 클래스 배열을 시간순으로 오름차순 정렬한다
6. 개발자들의 악수 과정에서 감염되는 것을 판별한다
    6-1. 감염여부 배열에서 x가 만약 true, 즉 감염되어져 있고,
     악수 횟수가 0보다 크면 y를 감염여부 배열에서 true로 바꾸고 악수횟수를 -1한다
    6-2. 감염여부 배열에서 y가 만약 true, 즉 감염되어져 있고,
     악수 횟수가 0보다 크면 x를 감염여부 배열에서 true로 바꾸고 악수횟수를 -1한다
7. 개발자들의 감염여부에 따라 감염여부가 true면 1을 출력하고 false면 0을 출력한다
 */
public class HandShakeAndPlague {
    static Scanner sc = new Scanner(System.in);
    // 최종 감염 여부 판단 배열
    static ArrayList<plague> handshake = new ArrayList<>();
    static boolean[] plagueResult;
    static int[] numberOfHandshake;
    public static void main(String[] args) {
        // 개발자의 수
        int N = sc.nextInt();
        // 전염시키는 악수의 횟수
        int K = sc.nextInt();
        // 최초유포자 개발자 번호
        int P = sc.nextInt();
        // 악수의 횟수
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            handshake.add(new plague(t, x, y));
        }
        // 감염여부 배열 생성
        plagueResult = new boolean[N];
        plagueResult[P - 1] = true;

        // 악수 횟수 배열 생성
        numberOfHandshake = new int[N];
        Arrays.fill(numberOfHandshake, K);

        // 시간순으로 오름차순 정렬
        Collections.sort(handshake);

        calculateHandShake(T);

        printPlagueResult();
    }
    /**
     * 개발자들의 감염여부를 출력하는 함수
     */
    private static void printPlagueResult() {
        for(boolean result : plagueResult){
            if(result){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
    }
    /**
     * 개발자들의 악수 과정에서 감염되는 것을 판별하는 함수
     * @param T 악수의 횟수
     */
    private static void calculateHandShake(int T) {
        for(int i = 0; i < T; i++){
            if((plagueResult[handshake.get(i).x -1] && numberOfHandshake[handshake.get(i).x -1] > 0)){
                plagueResult[handshake.get(i).y - 1] = true;
                numberOfHandshake[handshake.get(i).x -1]--;
            }
            else if((plagueResult[handshake.get(i).y -1] && numberOfHandshake[handshake.get(i).y -1] > 0)){
                plagueResult[handshake.get(i).x - 1] = true;
                numberOfHandshake[handshake.get(i).y -1]--;
            }
        }
    }
}
class plague implements Comparable<plague>{
    int time;
    int x;
    int y;
    plague(int time, int x, int y){
        this.time = time;
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(plague p1) {
        if(p1.time < time){
            return 1;
        }else if(p1.time > time){
            return -1;
        }else{
            return 0;
        }
    }
}