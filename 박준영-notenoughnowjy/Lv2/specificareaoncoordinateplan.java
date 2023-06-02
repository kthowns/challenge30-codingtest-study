/*
 * 물체 단위로 완전탐색 / 좌표명면 위의 특정 구역 2
 * 
 * 좌표명면 위에 점 N개가 있습니다. 그 N개의 점들 중 정확히 하나의 점만 빼서, 
 * 뺀 후의 모든 점들을 포함하는 직사각형의 넓이를 최소로 하는 프로그램을 작성해보세요.
 * 
 * 입력 : 
 * 4
 * 2 4
 * 1 1
 * 5 2
 * 17 25
 * 
 * 출력 :
 * 12 
 * 
 * 의사 코드
 * 평면 위에서 직사각형의 넓이는 결국 각 축에서 가장 큰 값 - 가장 작은 값을 하고
 * 각 축을 곱한 것이다.
 * 그렇다면 한 점씩 빼가면서 최솟값을 result에 저장하고 출력하면 답이다.
 * 1. 배열 선언하기 -> x를 받을 배열과 y를 받을 배열
 * 2. n 입력받기
 * 3. x배열의 값과 y배열의 값 입력받기
 * 4. for문으로 각각의 점 제거하기
 * -> if(i==j) continue; 를 쓴다면 다음 반복문으로 넘어갈 수 있다.
 * 5. result값에 x * y의 최솟값 받기
 * 6. 출력하기
 * 
 */

import java.util.Scanner;

public class specificareaoncoordinateplan {
  public static int Max_N = 40000;
  public static int[] x = new int[Max_N];
  public static int[] y = new int[Max_N];
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // n입력받기

    for(int i=0; i<n; i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }

    int result = Integer.MAX_VALUE; 
    for(int i=0; i<n; i++){
      int Max_X = 0;
      int Max_Y = 0;
      int Min_X = Integer.MAX_VALUE;
      int Min_Y = Integer.MAX_VALUE;
      for(int j=0; j<n; j++){
        if(j == i){
          continue;
        }
        Max_X = Math.max(Max_X, x[j]); //x의 최대
        Min_X = Math.min(Min_X, x[j]); //x의 최소
        Max_Y = Math.max(Max_Y, y[j]); //y의 최대
        Min_Y = Math.min(Min_Y, y[j]); //y의 최소
        
      }
      result = Math.min(result, (Max_X - Min_X) * (Max_Y - Min_Y)); // 넓이중의 최솟값 저장
    }
    System.out.println(result);
  }
}
