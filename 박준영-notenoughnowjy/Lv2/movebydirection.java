import java.util.Scanner;


/*
 * 방향에 맞춰 이동
 * 
 * 입력
 * 4
 * N 3
 * E 2
 * S 1
 * E 2
 * 
 * 출력
 * 
 * 4 2
 */

 /*
  * 의사 코드
  1.(0,0)에서 시작한다.
  2. 문자열을 받으면 dirNum에 관한 정보를 받는다.
  3. 얼마만큼 이동할지에 대한 move 값을 받아서 dirNum과 곱해준다.
  4. 출력한다.
  */


public class movebydirection{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int nx=0, ny=0;
        int dirNum;

        // 인덱스 0=동 / 1=북 / 2=서 / 3=남
        int[] dx = new int[]{1, 0, -1, 0}; //동 북 서 남
        int[] dy = new int[]{0, 1, 0, -1}; //동 북 서 남


        System.out.print("얼마만큼의 dirNum을 입력? : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){

            //처음에는 String을 통해서 문자를 받았는데 출력 값이 0,-2가 나왔었다. 이에 대해서 질문이 필요할 것 같다.
            //코드 리뷰 해주시면 이것에 대해서 알려주세요!
            char direction = sc.next().charAt(0);int move = sc.nextInt();

            if(direction == 'E'){ // 동쪽 일때
                dirNum = 0;
            }

            else if(direction == 'N'){ // 북쪽 일때
                dirNum = 1;
            }

            else if(direction == 'W'){ // 서쪽 일때
                dirNum = 2;
            }

            else{ // 남쪽 일때
                dirNum = 3;
            }

            nx += dx[dirNum]*move;
            ny += dy[dirNum]*move;
        }
        System.out.println(nx + " " + ny);

    }
}