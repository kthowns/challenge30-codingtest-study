/*
 * 자리 수 단위로 완전 탐색 / 원 모양으로 되어있는 방
 * 원 모양으로 되어있는 N개의 방이 있고, 방은 1부터 N까지 시계 반대방향으로 번호가 매겨져 있습니다.
 * 각 방에는 이웃한 두 개의 방으로 통하는 문이있습니다. 사람들은 무조건 시계 반배 방향으로만
 * 이동해야 합니다. 각자 방에 몇 명이 사람이 들어가야하는지 주어지며, 모든 사람이
 * 같은 방에서 시작한다고 합니다. 어떤 방에서 시작해야 강 방에 정해진 인원이 들어가는 데까지의
 * 거리의 합을 최소화 할 수 있는지를 계산하는 프로그램을 작성해보세요.
 * 
 * 입력 : 
 * 5
 * 4
 * 7
 * 8
 * 6
 * 4
 * 
 * 출력 : 
 * 48
 * 
 * 
 * 
 */

 /*
  * 의사 코드
  1. n값 입력받기
  2. 배열에 값 입력하기
  3. (j + n - i) 알고리즘 이용하기 -> 이 부분만 해설을 봤다.
  4. 최솟값 구하기
  */

import java.util.Scanner;

public class shapeiscircleroom {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] list = new int[n];
    
    for(int i=0;i<n;i++){
      list[i] = sc.nextInt();
    }
    
    int result = Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
      int diff = 0;
      for(int j=0;j<n;j++){
        int dist = (j + n - i) % n;
        diff = diff + dist * list[j];
      }
      result = Math.min(result, diff);
    }

    System.out.println(result);

  }
}
