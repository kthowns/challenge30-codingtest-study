import java.util.ArrayList;
import java.util.Scanner;
public class MovingRobots {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> timeTableA = new ArrayList<>();
    static ArrayList<Integer> timeTableB = new ArrayList<>();
    static int i =0;
    static int j = 0;
    static int present = 0;
    static int count = 0;
    static int temp = 0;
    static boolean continuous = false;
    public static void main(String[] args){
        int n = sc.nextInt();
        int m = sc.nextInt();

        timeTableA.add(0);
        insertMove(n, timeTableA);

        present = 0;
        timeTableB.add(0);
        insertMove(m, timeTableB);

        calculateMeetingCount();

        printMeetingCount();
    }
    /**
     * 방향과 경과시간을 입력받는 함수
     * @param n 입력받을 횟수
     * @param timeTable 이동을 기록할 배열
     */
    private static void insertMove(int n, ArrayList<Integer> timeTable) {
        for (i = 0; i < n; i++) {
            int time = sc.nextInt();
            String direction = sc.next();
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
     * 만난 시점의 수를 계산하는 함수
     */
    private static void calculateMeetingCount(){
        if(timeTableA.size() > timeTableB.size()) {
            equalCalculate(timeTableA, timeTableB);
        }
        else{
            equalCalculate(timeTableB, timeTableA);
        }
    }
    /**
     * 동일한지 계산하는 함수
     * @param bigTimeTable 이동하는 횟수가 더 많은 배열
     * @param smallTimetable 이동하는 횟수가 작은 배열
     */
    private static void equalCalculate(ArrayList<Integer> bigTimeTable, ArrayList<Integer> smallTimetable) {
        for (i = 1; i < bigTimeTable.size(); i++) {
            if (i >= smallTimetable.size()) {
                if(!continuous){
                    if (bigTimeTable.get(i).equals(smallTimetable.get(smallTimetable.size() - 1))) {
                        continuous = true;
                        temp = bigTimeTable.get(i);
                        count++;
                    }
                }
                else{
                    if(bigTimeTable.get(i) != temp){
                        continuous = false;
                    }
                }
            }
            else {
                if(!continuous){
                    if (bigTimeTable.get(i).equals(smallTimetable.get(i))) {
                        continuous = true;
                        count++;
                    }
                }
                else{
                    if(bigTimeTable.get(i) != temp){
                        continuous = false;
                    }
                }
            }
        }
    }
    /**
     * 만난 시점의 수를 출력하는 함수
     */
    private static void printMeetingCount() {
        System.out.println(count);
    }
}
