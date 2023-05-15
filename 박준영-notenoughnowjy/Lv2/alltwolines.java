import java.util.Scanner;
/*
 * 겹치는 경우 / 전부 겹치는 선분
 * 
 * 의사 코드
 * 1. 선분 몇개를 입력 받을지에 대한 값 n을 입력받는다.
 * 2. 값들을 입력받는다.
 * 3. 두 라인이 겹치는 조건 값을 설정한다.
 * -> 
 * 4. 사이값들이 모두 겹치는 부분이 있다면 yes, 없다면 no를 출력한다.
 * 
 * 입력 : 
 * 3
 * 1 5 
 * 4 6
 * 2 4
 * 
 * 출력 : 
 * Yes
 */

public class alltwolines{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x1, x2;
    int Maxvalue = 0;
    int Minvalue = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      x1 = sc.nextInt();
      x2 = sc.nextInt();
      Maxvalue = Math.max(Maxvalue, x1);
      Minvalue = Math.min(Minvalue, x2);

    }
    if(Minvalue >= Maxvalue){
      System.out.print("Yes");
    }
    else{
      System.out.print("No");
    }
  }
}

    // int Max_N = 200;
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // int[] lines = new int[Max_N];
    // for(int i=0;i<2*n;i++){
    //   lines[i] = sc.nextInt();
    // }

    // if(lines[1]>=lines[2] || lines[3]>=lines[0] && lines[1] >= lines[4] || lines[5] >= lines[0] && lines[5] >= lines[2] || lines[3] >= lines[4]){
    //   System.out.println("Yes");
    // }
    // else{
    //   System.out.println("No");
    // }