import java.util.ArrayList;
import java.util.Scanner;
/*
의사코드
1. 좌표평면 위의 좌표의 수 N을 입력한다
2. 좌표를 입력받을 클래스 배열을 만든다
3. for문으로 N번 만큼 반복한다
    3-1. 좌표를 1개씩 제거하고 남은 좌표의 x, y값의 최대 최소를 구한다
    3-2. 구한 x, y값의 최대 최소로 가로 세로 크기를 구해 사각형의 넓이를 구한다
    3-3. 구한 넓이와 이전에 구한 넓이 중 작은 값을 minArea에 할당한다
    3-4. 제거한 좌표를 다시 클래스 배열의 기존 인덱스에 삽입한다
4. 사각형들의 넓이 중 최솟값을 출력한다
 */
public class SpecificAreaOnCoordinatePlane {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Coordinates> coordinateList = new ArrayList<>();
    static int minArea = Integer.MAX_VALUE;
    public static void main(String[] args){
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            coordinateList.add(new Coordinates(x, y));
        }

        calculateMinArea(N);

        System.out.println(minArea);
    }
    /**
     * 사각형의 넓이가 최소가 되는 점들을 계산하는 함수
     * @param N 좌표들의 수
     */
    private static void calculateMinArea(int N) {
        for (int i = 0; i < N; i++) {
            Coordinates removedCoordinate = coordinateList.remove(i);
            int max_X = Integer.MIN_VALUE;
            int min_X = Integer.MAX_VALUE;
            int max_Y = Integer.MIN_VALUE;
            int min_Y = Integer.MAX_VALUE;
            for(Coordinates coordinates : coordinateList){
                max_X = Math.max(max_X, coordinates.x);
                min_X = Math.min(min_X, coordinates.x);
                max_Y = Math.max(max_Y, coordinates.y);
                min_Y = Math.min(min_Y, coordinates.y);
            }
            int xDistance = max_X - min_X;
            int yDistance = max_Y - min_Y;
            int area = xDistance * yDistance;
            minArea = Math.min(area, minArea);

            coordinateList.add(i, removedCoordinate);
        }
    }
}

/**
 * 좌표의 x값과 y값을 저장하는 클래스
 */
class Coordinates{
    int x;
    int y;
    Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
}