/*
 * 물체 단위로 완전탐색 / 스승의 은혜 2
 * 선생님이 N명의 학생에게 B만큼의 예산으로 선물을 주려고 합니다.
 * 학생 i가 원하는 선물의 가격 P(i)가 있고, 선생님에게는 선물 하나를 정해서
 * 반값으로 할인받을 수 있는 쿠폰이 있습니다. 선생님이 선물 가능한 학생의 최대 명수를
 * 구하는 프로그램을 작성해보세요. 단, 선물의 가격은 항상 짝수입니다.
 * 
 * 입력 : 
 * 5 18
 * 4
 * 2
 * 8
 * 6
 * 12
 * 
 * 출력 : 
 * 4
 * 
 *
 */

 /*
  * 의사 코드

  */

import java.util.Arrays;
import java.util.Scanner;

public class teachersgrace {
  public static final int Max_N = 1000; // Max_N 배열 입력
  public static final int coupon = 2; // 반값 할인 coupon
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt(); // 학생 수 입력 받기
    int b = sc.nextInt(); // 예산 입력받기
    int[] p = new int[Max_N]; // 비용이 들어있는 p 배열 받기

    for(int i=0; i<n; i++){
      p[i] = sc.nextInt(); // 비용 입력받기

      // System.out.println(p[i]);
    }

    int maxcnt = 0; // cnt의 max값 전역변수로 선언
    for(int i=0; i<n; i++){
      int[] tmp = new int[Max_N]; // tmp를 만들어주기
      for(int j=0; j<n; j++){
        tmp[j] = p[j]; // tmp에 p[i]를 넣어서 매 반복문마다 초기화 시켜주기
      }
      tmp[i] /= coupon; // tmp[i]값에 반값 쿠폰을 사용하고 값 저장하기

      Arrays.sort(tmp, 0, n); // 순서대로 정렬 -> 순서대로 정렬하고 차례로 사주는 것이 가장 많은 학생에게 사줄 수 있는 것

      int cnt = 0; // cnt값 지역변수로 선언
      int sum = 0; // sum값 지역변수로 선언

      for(int j=0; j<n; j++){ 
        if(sum + tmp[j] > b){ // sum + tmp[j]가 b보다 크면 break를 건다. -> sum으로 조건을 거면 cnt++후 하나가 더해진 cnt값이 출력되기 때문
          break;
        }
        sum += tmp[j];
        cnt++;
      }
      
      maxcnt = Math.max(maxcnt, cnt); // cnt의 max값을 maxcnt에 저장
    }
    System.out.println(maxcnt); // maxcnt값 출력
  }
}
