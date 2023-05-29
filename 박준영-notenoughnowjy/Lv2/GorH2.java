/*
 * 구간 단위로 완전탐색 / G or H 2
 * 
 * N명의 사람들이 일직선상에서 본인들에게 주어진 번호에 해당하는 위치에 서서 G와 H중
 * 받은 알파벳의 팻말을 들고있습니다. 오로지 G 혹은 H로만 이루어져 있거나,
 * G와 H가 정확히 같은 개수만큼 나오게 사진을 찍고싶을 때, 최대 사진의 크기를 찾는
 * 프로그램을 작성해보세요. 이때, 사진의 크기란 사진에서 양쪽 끝에 있는 사람 간의 거리로
 * 정의되며, 사람이 1명 뿐인 경우에는 사진의 크기가 0입니다.
 * 
 * 입력 : 
 * 6
 * 4 G
 * 10 H
 * 7 G
 * 16 G
 * 1 G
 * 3 H
 * 
 * 출력 :
 * 7
 * 
 * 입력 : 
 * 1
 * 2 G
 * 
 * 출력 : 
 * 0
 */


 /*
  * 의사 코드
  1. n값을 입력받는다.
  2. char값을 받을 arr배열을 만든다.
  3. x의 값을 이용해서 char c 의 문자를 위치에 입력받는다.
  4. 각 위치에서 값을 비교한다.
  5. g의 개수와 h의 개수를 각각 헤아린다.
  6. g의 개수가 0이거나 h의 개수가 0이거나 g-h의 값이 0일 경우 j-i값을 한다.
  7. len의 최대값들을 뽑아서 maxLen에 넣어준다.
  8. maxLen을 출력한다.
  */

import java.util.Scanner;

public class GorH2{
  public static int Max_N = 101;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    char[] arr = new char[Max_N];

    for(int i=0; i<n;i++){
      int x = sc.nextInt();
      char c = sc.next().charAt(0);

      arr[x] = c;
    }

    int maxLen = 0;
    for(int i=0; i<Max_N; i++){
      for(int j=i+1; j<Max_N; j++){
        if(arr[i] == 0 || arr[j] == 0){
          continue;
        }
        int Gcnt = 0;
        int Hcnt = 0;

        for(int k=i;k<=j;k++){
          if(arr[k] == 'H'){
            Hcnt++;
          }
          if(arr[k] == 'G'){
            Gcnt++;
          }
        }

        if(Hcnt == 0 || Gcnt == 0 || Hcnt == Gcnt){
          int len = j - i;
          maxLen = Math.max(maxLen, len);
        }
      }
    }
    System.out.println(maxLen);
    // for(int i=0;i<Max_N;i++){
    //   System.out.println(i + ":" + arr[i]);
    // }
  }
}