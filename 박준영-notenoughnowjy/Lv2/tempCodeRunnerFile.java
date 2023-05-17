/*
 * 좌우로 움직이는 로봇
 * 1차원 직선 위에서 1초에 한 칸씩 좌우로만 왔다 갔다 하는 로봇 A와 B
 * A가 움직이는 횟수 n과 B가 움직이는 횟수 m이 주어지고, 얼마나 움직이는지 주어진다.
 * 로봇 A와 B가 바로 직전에는 다른 위치에 있다가 그 다음 번에 같은 위치에 오게 되는 경우는 총 몇번인지?
 * 로봇 A, B는 처음에 같은 지점에서 움직이며 이는 횟수에 포함 X
 * 로봇 A와 B의 움직임을 종료한 이후에는 같은 위치에 계속 머물러 있으며,
 * 이때 다른 로봇이 움직임에 따라 두 로봇이 같은 위치에 오게될 수 있다.
 * 다만, 모든 로봇이 움직인 이후의 상황은 생각하지 않는다.
 * 
 * 입력 : 
 * 4 5
 * 3 L
 * 5 R
 * 1 L
 * 2 R
 * 4 R
 * 1 L
 * 3 L
 * 4 R
 * 2 L
 * 
 * 출력 : 3

 */

import java.util.Scanner;

public class moveleftrightrobot {
  public static void main(String[] args){

    int Max_N = 1000000;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] RobotA = new int[Max_N+1];
    int[] RobotB = new int[Max_N+1];

    int countA = 1;
    for(int i=0; i<n; i++){
      char t = sc.next().charAt(0);
      int d = sc.nextInt();

      while(t-->0){
        if(t == 'R'){
          RobotA[countA] = RobotA[countA] + 1;
        }
        else{
          RobotA[countA] = RobotA[countA] - 1;
        }
        countA++;
      }
    }
    int countB = 1;
    for(int i=0; i<n; i++){
      char t = sc.next().charAt(0);
      int d = sc.nextInt();

      while(t-->0){
        if(t == 'R'){
          RobotB[countB] = RobotB[countB] + 1;
        }
        else{
          RobotB[countB] = RobotB[countB] - 1;
        }
        countB++;
      }  
    }
    int total = 0;
    for(int i=0;i<countA;i++){
      if(RobotA[i] == RobotB[i]){
        total++;
      }
      System.out.println(total);
    }
  }
}
