import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
  int distance;
  int number;

  public Point(int distance, int number){
    this.distance = distance;
    this.number = number;

  }
  // public int compareTO(Point point){
  //   if(Math.abs(x)+Math.abs(y) != Math.abs(point.x)+Math.abs(point.y)){
  //     return Math.abs(x)+Math.abs(y) - Math.abs(point.x)+Math.abs(point.y);
  //   }
  //   return number - point.number;
  // }

  public int compareTo(Point point){
    if(distance != point.distance){
      return distance - point.distance;
    }
    return number - point.number;
  }
}
public class distancefromorigin{

  /* 원점으로부터의 거리
   * 2차 평면 위에 N개의 점이 주어졌을 때,
   * 원점에서 가까운 점부터 순서대로 번호를 출력하는 프로그램을 작성
   * 거리가 같은 점이 여러 개인 경우, 번호가 작은 점 부터 출력
   * 
   * 거리 = 멘하턴 거리
   * 멘하턴 거리란?
   * 두 점 (x1,y1), (x2,y2) 사이의 멘하턴 거리는
   * |x1 - x2| + |y1 - y2|로 정의됩니다.
   * 
   * 
   * 입력 : 
   * 2
   * 1 5
   * -3 2
   * 
   * 출력 : 
   * 2
   * 1
   * 
   * 입력 : 
   * 4
   * 1 8
   * 3 4
   * 5 5
   * -7 0
   * 
   * 출력 : 
   * 2
   * 4
   * 1
   * 3
   * 
   */
  // public static int distfromorigin(int x, int y){
  //   return Math.abs(x) + Math.abs(y);
  // }

  public static void main(String[] args){

    Point[] point = new Point[200];

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int x,y;
    for(int i=0;i<n;i++){
      x = sc.nextInt();y = sc.nextInt();
      int distance = Math.abs(x)+Math.abs(y);
      point[i] = new Point(distance, i+1);
    }

    Arrays.sort(point, 0, n);

    for(int i=0;i<n;i++){
      System.out.println(point[i].number);
    }
  }
}