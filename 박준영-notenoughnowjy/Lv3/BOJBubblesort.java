/*
 * [BOJ] / 버블 정렬
 * 
 * 버블 정렬이란, 두 인접한 원소를 검사하여 자리를 바꾸는 방식으로 길이가 N인 수열을 정렬하는 알고리즘이다.
 * 버블 정렬은 아래와 같은 단계를 총 N번 진행하면 된다.
 * 1. 첫 번째 값과 두 번째 값을 비교하여 첫 번째 값이 더 크면 자리를 바꾼다.
 * 2. 두 번째 값과 세 번째 값을 비교하여 두 번째 값이 더 크면 자리를 바꾼다.
 * N - 1번째 값과 N번째 값을 비교하여 N-1번째 값이 더 크면 자리를 바꾼다.
 * 세찬이는 버블 정렬의 결과는 당연히 알기에 버블 정렬의 중간 과정을 알아보려고 한다.
 * 하지만 N이 매우 크므로 위와 같은 단계를 K번 하면 시간이 오래 걸린다.
 * 세찬이를 도와 버블 정렬의 중간 과정을 구하는 프로그램을 작성하여라.
 * 
 * 입력 : 
 * 4 1
 * 62 23 32 15
 * 
 * 출력 : 
 * 23 32 15 62
 * 
 * 의사 코드
 * 1. n과 n+1의 값 또는 n-1과 n의 값을 비교한다.
 * 2. n 또는 n-1의 값이 n+1 또는 n의 값보다 크면 그 인덱스의 값은 n으로 대체한다.
 * 3. 하지만 크지 않다면 continue를 사용해서 넘겨준다.
 * 4. 이 알고리즘에서 temp(제 3의 변수)의 역할이 필요해 보인다.
 */

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJBubblesort {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    // int[] arr = new int[N];
    // for(int i=0; i<N; i++){
    //   arr[i] = sc.nextInt();
    // }
    /*
     * K를 어디다 사용해야 할까?..
     * -> 큐를 사용하여 가장 작은 값이 들어오면 pop해주는 알고리즘
     */
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0; i<N; i++){
      pq.offer(sc.nextInt());

      if(i>=K){ // i가 K보다 커진다면 pq에서 poll을 해준다.
        System.out.println(pq.poll() + " ");
      }
      /*
       * 첫번째 값을 저장한 다음, 두번째 i(1)가 들어왔을 때, poll을 해준다.
       * 두번째 값 부터는 부모의 값과 비교하여 자신보다 값이 클 경우 값을 교체해준다.
       */
    }
    while(!pq.isEmpty()){ // queue가 비어있다면 출력
      System.out.print(pq.poll() + " ");
    }
  }
}
