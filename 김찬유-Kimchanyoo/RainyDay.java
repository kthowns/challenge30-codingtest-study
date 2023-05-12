import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
의사코드
1. 기상 데이터의 개수를 정해주는 n을 입력받는다
2. 기상 정보를 입력받고 날씨가 Rain일시 rainyDayList에 집어넣어준다
3. 비오는 날이 들어가있는 리스트를 정렬한다
4. 리스트가 정렬되어져있기 때문에 리스트의 0번째 값을 출력한다
 */
public class RainyDay {
    static ArrayList<Day> rainyDayList = new ArrayList<Day>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        storeRainyDayList(n);
        sortedDayList();
        printEarlyRainyDay();
    }

    /**
     * 기상 정보를 입력받고 날씨가 Rain일시 rainyDayList에 집어넣는 함수
     */
    private static void storeRainyDayList(int n) {
        for(int i = 0; i < n; i++){
           String[] tempList = sc.nextLine().split(" ");
           if(tempList[2].equals("Rain")){
               rainyDayList.add(new Day(tempList[0],tempList[1],tempList[2]));
           }
        }
    }
    /**
     * 비오는 날이 들어가있는 리스트를 정렬하는 함수
     */
    private static void sortedDayList() {
        Collections.sort(rainyDayList);
    }
    /**
     * 비오는 날을 출력하는 함수
     */
    private static void printEarlyRainyDay() {
        System.out.println(rainyDayList.get(0).toString());
    }
}
class Day implements Comparable<Day>{
    String day;
    String dayOfWeek;
    String weather;
    // 생성자
    public Day(String day, String dayOfWeek, String weather){
        this.day = day;
        this.dayOfWeek = dayOfWeek;
        this.weather = weather;
    }
    public String getDay(){
        return day;
    }
    public void setDay(String day){
        this.day = day;
    }
    public String getDayOfWeek(){
        return dayOfWeek;
    }
    public void setDayOfWeek(String dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }
    public String getWeather(){
        return dayOfWeek;
    }
    public void setWeather(String weather){
        this.weather = weather;
    }
    @Override
    public String toString() {
        return (day + " " + dayOfWeek + " " +  weather);
    }
    @Override
    public int compareTo(Day date) {
        return this.day.compareTo(date.day);
    }
}
