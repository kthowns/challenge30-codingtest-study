/*
자리 수 단위로 완전탐색 / 모이자
 * n개의 집이 x = 1에서 x = n까지 순서대로 놓여있고, 각각 Ai 명의 사람이 살고 있습니다.
 * 이들은 회의를 통해 n개의 집 중 한 곳에 전부 모이려고 합니다. 적절한 집을 선택하여
 * 모든 사람들의 이동 거리의 합이 최소가 되도록 하는 프로그램을 작성해보세요.
 * 
 * 입력 :
 * 5
 * 1 2 3 2 6
 * 
 * 출력 : 
 * 16
 */
import java.util.Scanner;

public class comeonhere {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] list = new int[n];
    for(int i=0;i<n;i++){
      list[i] = sc.nextInt();
    }
    
    /*
     * 의사 코드
     * 위에서 필요한 값은 모두 입력받았다.
     * 지점의 수를 입력 받았으며, 0,1,2,3,4라는 지점에 살고있는 사람의 수를 입력받았다.
     * 이중반복분 i,j를 사용한다.
     * i를 통해 지점의 기준을 입력받는다.
     * i-j를 해서 지점의 거리 차이를 찾고 각 지점의 list[j]를 통해 사람 수를 곱한다.
     * i-j를 절댓값 Math.abs로 받고 i-j와 list[j]의 값을 곱해준다.
     * 이렇게 곱해준 값을 diff값에 넣고 diff값 중에서 최솟값을 Math.min(minsum, diff)
     * 를 통해 최솟값을 정해서 거리의 최소를 구한다.
     * 최종적으로 minsum을 출력해준다.
     */

    int minsum = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      int diff = 0;
      for(int j=0;j<n;j++){
        diff = diff + Math.abs(i-j) * list[j];
      }
      minsum = Math.min(minsum, diff);
    }

    System.out.println(minsum);
  }
}

