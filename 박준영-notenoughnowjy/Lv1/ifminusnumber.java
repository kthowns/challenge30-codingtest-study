/*
 * if 조건문 / 음수 구별하기
 * 
 * 정수를 입력받아 출력하고 음수를 구별하는 프로그램을 작성해보세요
 * 
 * 입력 : -13
 * 
 * 출력 : 
 * -13
 * minus
 */

import java.util.Scanner;

public class ifminusnumber {
  public static String result = "minus";
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if(number<0){
      System.out.println(number);
      System.out.println(result);
    }
    else{
      System.out.println(number);
    }
  }
}
