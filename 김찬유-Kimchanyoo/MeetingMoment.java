import java.util.ArrayList;
import java.util.Scanner;
/*
의사코드
1. n과 m을 입력받는다
2. A가 n개 만큼 입력을 받는다(방향 이동시간)
    2-1. 입력을 받을 때 방향이 R이면 오른쪽, 즉 +1씩 증가시키면서 배열에 넣는다
    2-2. 입력을 받을 때 방향이 L이면 왼쪽, 즉 -1씩 감소시키면서 배열에 넣는다
3. B가 m개 만큼 입력을 받는다(방향 이동시간)
    3-1. 입력을 받을 때 방향이 R이면 오른쪽, 즉 +1씩 증가시키면서 배열에 넣는다
    3-2. 입력을 받을 때 방향이 L이면 왼쪽, 즉 -1씩 감소시키면서 배열에 넣는다
4. A와 B를 비교해서 처음으로 만난 시점을 firstMeet에 저장한다.
5. 처음만난 시점을 출력하고, 아니면 -1을 출력한다
 */
public class MeetingMoment {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> timeTableA = new ArrayList<Integer>();
    static ArrayList<Integer> timeTableB = new ArrayList<Integer>();
    static int i =0;
    static int j = 0;
    static int firstMeet = -1;
    static int present = 0;
    public static void main(String[] args){
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        timeTableA.add(0);
        insertMove(n, timeTableA);

        present = 0;
        timeTableB.add(0);
        insertMove(m, timeTableB);

        calculateFirstMove();

        printFirstMeet(firstMeet);

    }
    /**
     * 방향과 경과시간을 입력받는 함수
     * @param n 입력받을 횟수
     * @param timeTable 이동을 기록할 배열
     */
    private static void insertMove(int n, ArrayList<Integer> timeTable) {
        for (i = 0; i < n; i++) {
            String direction = sc.next();
            int time = sc.nextInt();
            move(timeTable, direction, time);
        }
    }
    /**
     * 이동을 기록하는 함수
     * @param timeTable 이동을 기록할 배열
     * @param direction 방향
     * @param time 이동 시간
     */
    private static void move(ArrayList<Integer> timeTable, String direction, int time) {
        for (j = 0; j < time; j++) {
            if (direction.equals("R")) {
                timeTable.add(timeTable.get(present) + 1);
            } else if (direction.equals("L")) {
                timeTable.add(timeTable.get(present) - 1);
            }
            present++;
        }
    }
    /**
     * 처음 만난 시점을 계산하는 함수
     */
    private static void calculateFirstMove(){
        for(i = 1; i < timeTableA.size(); i++){
            if(timeTableA.get(i).equals(timeTableB.get(i))){
                firstMeet = i;
                break;
            }
            else{
                continue;
            }
        }
    }
    /**
     * 처음으로 만난 시점을 출력하는 함수
     * @param firstMeet 첫 만남을 저장해두는 변수
     */
    private static void printFirstMeet(int firstMeet) {
        System.out.println(firstMeet);
    }
}
