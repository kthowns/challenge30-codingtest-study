import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
의사코드
1. 점의 개수 n을 입력한다
2. n개의 점을 입력해준다
3. 각 점의 원점으로부터의 거리를 구한다
    3-1. 원점으로부터의 거리이기 때문에 점의 x좌표의 절대값과 y좌표의 절댓값을 더한다
4. 각 점을 원점으로부터의 거리로 정렬한다
    4-1. 거리를 비교하여 거리가 다르면 원점으로부터 가까운 순서대로 정렬
    4-2. 거리를 비교하여 거리가 같으면 작은 번호 순으로 정렬
 */
public class DistanceFromOrigin {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Coordinate> coordinateList = new ArrayList<Coordinate>();
    public static void main(String[] args){
        int n = sc.nextInt();

        inputCoordinate(n);

        sortedCoordinate();

        printCoordinateRank();
    }

    /**
     * n개의 점들의 좌표와 번호를 ArrayList에 넣어주는 함수
     */
    private static void inputCoordinate(int n) {
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int number = i + 1;
            coordinateList.add(new Coordinate(x, y, number));
        }
    }

    /**
     * 원점으로부터 거리순으로 점들을 정렬하는 함수
     */
    private static void sortedCoordinate() {
        Collections.sort(coordinateList);
    }

    /**
     * 원점으로부터 거리순으로 점들을 출력하는 함수
     */
    private static void printCoordinateRank() {
        for(int i = 0; i < coordinateList.size(); i++){
            System.out.println(coordinateList.get(i).number);
        }
    }
}

/**
 * 점의 좌표가 주어지는 클래스
 */
class Coordinate implements Comparable<Coordinate>{
    int x;
    int y;
    int number;
    int distance;
    Coordinate(int x_Coordinate, int y_Coordinate, int number){
        this.x = x_Coordinate;
        this.y = y_Coordinate;
        this.number = number;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    /**
     * 원점으로부터의 거리를 구하는 함수
     */
    private void calcDistance(){
        distance = Math.abs(x) + Math.abs(y);
    }

    @Override
    public String toString() {
        return (x + " " + y + " " + number);
    }

    @Override
    public int compareTo(Coordinate cord) {
        this.calcDistance();
        cord.calcDistance();
        // 원점으로부터의 거리가 다르면 거리순으로 오름차순 정렬
        if(this.distance != cord.distance){
            return this.distance - cord.distance;
        }
        // 원점으로부터 거리가 같으면 번호순으로 오름차순
        else{
            return this.number - cord.number;
        }
    }
}
