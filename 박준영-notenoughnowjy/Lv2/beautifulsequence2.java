/*
 * N개의 숫자로 이어진 수열 A와 M개의 숫자로 이루어진 수열 B가 주어집니다.
 * 수열 B의 각 원소들의 순서를 바꿔 나오는 수열을 아름다운 수열이라고 합니다.
 * 수열 A에서 길이가 M인 연속 부분 수열들 중 아름다운 수열의 수를 세는 프로그램을 작성해보세요.
 * 
 * 예를 들어 수열 B를 "4 6 7"이라 했을 때 "4 6 7" , "4 7 6", "6 4 7", "7 4 6", "7 6 4"는
 * 모두 아름다운 수열이 됩니다.
 * 
 * 입력 : 첫 번째 줄에는 N, M이 공백을 사이에 두고 주어집니다.
 * 두 번째 줄에는 수열 A에 해당하는 N개의 숫자가 공백을 사이에 두고 주어집니다.
 * 세 번째 줄에는 수열 B에 해당하는 M개의 숫자가 공백을 사이에 두고 주어집니다.
 * 
 * 출력 : 첫 번째 줄에 수열 A의 연속 부분 수열들 중 아름다운 수열의 수를 출력합니다.
 * 
 * 입력
 * 8 3
 * 2 4 6 7 5 7 6 4
 * 4 6 7
 * 아름다운 수열 -> (4 6 7), (7 6 4)
 * 
 * 출력
 * 2
 * 
 * 의사 코드
 * 1. N과 M이 공백을 사이에 두고 주어집니다. 
 * 2. N개의 숫자를 배열에 넣는다.
 * 3. M개의 숫자로 이루어진 수열 B를 주어진다.
 * 4. 수열 B의 덧셈과 곱셈 값을 저장한다.(arrsum, arrmul)
 * 5. 배열을 차례로 탐색하면서 arrsum과 arrmul값과 일치하면 cnt++
 * 6. 결과적으로 cnt++을 출력한다.
 * 
 * 
 * 두번째 의사 코드
 * 1. N과 M이 공백을 사이에 두고 입력받는다.
 * 2. N개의 숫자를 배열에 넣는다
 * 3. M개의 숫자를 배열에 넣는다.
 * 4. N개의 숫자를 입력받은 배열에서 i ~ i+m번쨰 까지의 수를 배열 하나(thirdarr)를 더 선언해서 넣어준다.
 * 5. 그 배열을 Arrays.sort()로 정렬해준다.
 * 6. M개의 숫자가 들어있는 배열을 정렬해준다.
 * 7. thirdarr과 M개의 숫자가 들어있는 배열을 비교해서 같으면 cnt++을 해준다.
 */

import java.util.Arrays;
import java.util.Scanner;

public class beautifulsequence2 {
  public static int Max_N = 200;
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
  
    int[] firstarr = new int[Max_N];
    int[] secondarr = new int[Max_N];
    int[] thirdarr = new int[Max_N];
  
    for(int i=0;i<n;i++){
      firstarr[i] = sc.nextInt();
    }
    for(int i=0;i<m;i++){
      secondarr[i] = sc.nextInt();
    }

    Arrays.sort(secondarr, 0, m);

    int cnt = 0;
    for(int i=0;i<=n-m;i++){
      for(int j=0;j<m;j++){
        thirdarr[j] = firstarr[i+j];
      }
      Arrays.sort(thirdarr, 0, m);


      // for(int j=0;j<m;j++){
      //   if(thirdarr[j] == secondarr[j]){
      //     cnt++;
      //   }
      //   // System.out.print(thirdarr[j] + " "); 

      //   // System.out.print(secondarr[j] + " "); 
      // }

      boolean issame = true;
      for(int j=0;j<m;j++){
        if(thirdarr[j] != secondarr[j]){
          issame = false;
          break;
        }

        if(issame){
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}


    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int m = sc.nextInt();

    // int[] firstarr = new int[Max_N];
    // int[] secondarr = new int[Max_N];
    // for(int i=0;i<n;i++){
    //   firstarr[i] = sc.nextInt();
    // }

    // int resultsum = 0;
    // int resultmul = 1;
    // for(int i=0;i<m;i++){
    //   secondarr[i] = sc.nextInt();
    //   resultsum += secondarr[i];
    //   resultmul *= secondarr[i];
    // }

    // // System.out.println(resultsum + " " + resultmul);
    // int cnt = 0;
    // for(int i=0;i<=n-m;i++){
    //   int arrsum = 0;
    //   int arrmul = 1;
    //   for(int j=i;j<i+m;j++){
    //     arrsum += firstarr[j];
    //     arrmul *= firstarr[j];
    //     if(arrsum == resultsum && arrmul == resultmul && ){
    //       cnt++;          
    //     }
        
    //   }
    // }
    // System.out.println(cnt);


