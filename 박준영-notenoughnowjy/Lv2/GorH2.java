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
 */

import java.util.Scanner;

public class GorH2{
  public static int Max_N = 100;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] positions = new int[Max_N];
    String[] strings = new String[Max_N];
    
    for(int i=0; i<n;i++){
      positions[i] = sc.nextInt();
      strings[i] = sc.next().charAt(0);
    }
  }
}