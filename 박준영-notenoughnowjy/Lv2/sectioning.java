/*
 * 구간 단위로 완전탐색 / 구간 중 최대 합
 * n개의 숫자들이 주어졌을 때, 연속하여 k개의 숫자를 골랐을 때의
 * 합이 최대가 되도록 하는 프로그램을 작성해보세요.
 * 
 * 입력 : 첫 번째 줄에는 n과 k가 주어집니다.
 * 두 번째 줄에는 n개의 숫자가 공백을 사이에 두고 주어집니다.
 * 
 * 출력 : 첫 번째 줄에 최댓값을 출력
 * 
 * 입력
 * 6 3
 * 9 1 2 4 7 1
 * (9 1 2) (1 2 4) (2 4 7)
 * 
 * 출력
 * 13
 */

 /*
  * 의사 코드
  1. Scanner로 n개의 숫자를 선별하고
  2. k로 몇개를 연속적으로 선별할 것인지에 대해 배정하고
  3. for(int i=0;i<n-k;i++)을 통해 기준점을 미리 선정하고
  4. for(int j=i;j<i+k;j++)를 통해 어디까지 반복할 것인지에 대해서 설정한다.
  5. i ~ i+k의 값들을 더해서 arraysum 배열에 저장한다.
  6. arraysum배열에 저장되는 값들 중 큰 값을 뽑아서 maxsum에 저장한다.
  7. 최종 arraysum값을 출력한다.
  */
  import java.util.Scanner;

  public class sectioning {
  
    public static int Max_N = 1000;
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); // n값 받기
      int k = sc.nextInt(); // k값 받기
  
      int[] arr = new int[Max_N];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt(); // 배열 저장
      }
  
      int maxsum = 0;
      for(int i=0;i<n-k;i++){ // 기준점 정하기
        int arraysum = 0;
  
        for(int j=i;j<=i+k;j++){ // 기준점 + k번까지 배열 검사하기
          arraysum += arr[j];
        }
        // System.out.println(arraysum);
        maxsum = Math.max(maxsum, arraysum); // arraysum에서 최댓값만 할당하기
      }
      System.out.println(maxsum); // 답 출력
    }
  }
  