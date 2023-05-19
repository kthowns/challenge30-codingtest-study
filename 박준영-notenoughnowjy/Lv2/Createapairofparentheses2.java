/*
 * 자리 수 단위로 완전탐색
 * 문자 '(' , ')'로만 이루어진 문자열 A가 주어지면 그 문자열들 사이에서 연속한 여는 괄호 두 개와
 * 연속한 닫는 괄호 두 개로 쌍을 이룰 수 있는 서로 다른 가지수를 구하는 프로그램을 작성해보세요.
 * 즉, 다음과 같은 모양을 띄는 쌍의 수를 세야 합니다.
 * ...((.....))....
 * 
 * 입력 : 
 * )((()())())
 * 
 * 출력 : 
 * 4
 */

 /*
  * 의사 코드
  1. String에 값을 입력받는다.
  2. String의 각 첫 char값을 비교한다.
  3.  count값을 출력한다.
  */

 import java.util.Scanner;

 public class Createapairofparentheses2 {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String list = sc.next();
     int n = (int) list.length();
     int count = 0;
     for(int i=0;i<n-1;i++){
       for(int j=i+1;j<n-1;j++){
         if(list.charAt(i) == '(' && list.charAt(i+1) == '(' && list.charAt(j) == ')' && list.charAt(j+1) == ')'){
           count++;
         }
        }
      }
      System.out.println(count);
   }
 }
 