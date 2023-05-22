/*
 * 자리 마다 숫자를 정하는 완전탐색 / 개발자의 능력 3
 * 
 * 개발자 6명의 알고리즘 능력을 수치화해 각각 정수로 주어지면 6명을 3명씩 2팀으로 배정해줍니다.
 * 팀원들의 능력 총합간의 차이를 최소화 할 수 있게 균형있게 구성해줄 때의 차를 출력하는 프로그램을 작성해보세요.
 * 
 * 입력 : 1 2 3 4 5 6
 * 
 * 출력 : 1
 * 
 * -> 결국 두 합 간의 최소화된 차를 구하는 프로그램이다.
 * 
 * 의사 코드
 * 1. 입력 값이 들어있는 배열을 만들어준다.
 * 2. 삼중 반복문을 통해서 모든 값들이 한번씩 같이 해당될 수 있게 해준다.
 * 3. sum1과 sum2를 받는다.
 * 4. sum2는 총 합에서 sum1을 뺀것과 같다.
 * 5. Math.abs(sum1 - sum2)의 최솟값을 구한다.
 * 6. result 값을 출력한다.
 */

import java.util.Scanner;

public class developersability {
  public static int Max_N = 6;
  
  public static int n = Max_N;
  public static int[] arr = new int[Max_N]; // 배열
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int result = Integer.MAX_VALUE; // 최솟값을 최대로 설정해준다.

      for(int i=0; i<n; i++){ // 배열 값 받기
        arr[i] = sc.nextInt();
      }

      for(int i=0; i<n; i++){ // i값 받기

        for(int j=i+1; j<n; j++){ // j값 받기

          for(int k=j+1; k<n; k++){ // k값 받기
            result = Math.min(result, getDiff(i, j, k)); // getDiff함수로 값 받은 후 result에 넣기
          }
        }
      }

      System.out.print(result); // 결과 값 출력
  }
    private static int getDiff(int i, int j, int k) { // getDiff 함수
      int totalsum = 0;
      for(int t=0;t<6;t++){ // sum2에 배열의 모든 값을 더해주기
        totalsum += arr[t]; // 종합적인 값 구하기
      }

      int sum1 = arr[i] + arr[j] + arr[k]; // sum1 값 구하기
      int sum2 = totalsum - sum1; // sum2 값 구하기
      return Math.abs(sum2 - sum1); // sum2 - sum1 해주기 -> 순서는 상관없음 -> 어차피 절댓값
    }
}
