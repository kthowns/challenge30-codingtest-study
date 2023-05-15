/*
 * 배열 기록 / 만나는 그 순간
 * A와 B가 동일한 시작점에서 출발합니다. 1초에 1m씩 움직이며
 * A, B는 각각 N번, M번에 걸쳐 주어지는 방향으로 특정 시간만큼 이동
 * A, B가 움직임을 시작한 이후에 최초로 만나게 되는 시간은 몇초 뒤?
 * 
 * 
 * 입력 : 
 * 3 4
 * R 9
 * L 3
 * R 5
 * L 2
 * R 2
 * L 1
 * R 12
 * 
 * 출력 :
 * 12

 */
import java.util.Scanner;
public class whentheymeet{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int Max_N = 999999;

    int[] WhereA = new int[Max_N];
    int[] WhereB = new int[Max_N];

    int countA = 1;
    for(int i=0;i<N;i++){
      char d = sc.next().charAt(0);
      int t = sc.nextInt();

      while(t-->0){
        if(d == 'R'){
          WhereA[countA] = WhereA[countA - 1] + 1;
        }
        else{
          WhereA[countA] = WhereA[countA - 1] - 1;
        }
        countA++;
      }
      
    }
    int countB = 1;
      for(int i=0;i<M;i++){
        char d = sc.next().charAt(0);
        int t = sc.nextInt();

        while(t-->0){
          if(d == 'R'){
            WhereB[countB] = WhereB[countB - 1] + 1;
          }
          else{
            WhereB[countB] = WhereB[countB - 1] - 1;
          }
          countB++;
        }
      }

      int result = -1;
      for(int i=1;i<countB;i++){
        if(WhereA[i]==WhereB[i]){
          result = i;
          break;
        }
      }
      System.out.print(result);
  }
}