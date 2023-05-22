/*
 * 자리 마다 숫자를 정하는 완전탐색 / 한 가지로 열리는 자물쇠
 * 1부터 N까지 숫자를 이용해 총 3자리를 만들어야 하는 자물쇠가 하나 주어집니다.
 * 이 자물쇠는 특이해서 한 자리라도 주어지는 조합과 거리가 2 이내라면 열리게 됩니다.
 * 
 * 예를 들어, N = 6이고 주어진 조합이 (1, 2, 3)이라면, 이 자물쇠는 (5, 4, 6)일 때
 * 두 번째 자리의 숫자 차이가 2 이내가 되므로 열리게 됩니다. 자물쇠 번호가
 * (1, 5, 6)인 경우에는 첫 번째 자리의 숫자 차이가 2 이내가 되므로 열리게 됩니다.
 * 
 * 입력 : 
 * 6
 * 1 2 3
 * 
 * 출력 : 
 * 210
 * 
 * 의사 코드
 * - 각각의 수를 비교
 * 1. 배열에 값 받기(x)
 * -> 배열에 값을 받지 말고 값을 따로따로 받자.(o)
 * 2. 2이내에 있는지 확인하기 -> cnt++
 * 3. 2이내에 없다면 return 0;
 * 4. cnt 출력하기
 * cf) 수가 많을 경우 2 이내에 없는 것을 세리는게 더 빠르지 않을까?
 * 
 */

import java.util.Scanner;

public class openoneway {
  public static int Max_N = 100;
  public static int cnt = 0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // 값 입력받기
    int num1 = sc.nextInt(); // 값 1
    int num2 = sc.nextInt(); // 값 2
    int num3 = sc.nextInt(); // 값 3

    for(int i=1; i<=n; i++){ // 값 1과 비교
      for(int j=1; j<=n; j++){
        for(int k=1; k<=n; k++){
          int result1 = Math.abs(num1 - i); // result1의 값 저장
          int result2 = Math.abs(num2 - j); // result2의 값 저장
          int result3 = Math.abs(num3 - k); // result3의 값 저장

          if(result1 <= 2 || result2 <= 2 || result3 <= 2){ // 차이가 2보다 작을 때 cnt++
            cnt++; 
          }
        }
      }
    }
    System.out.print(cnt);
    

  }
}
