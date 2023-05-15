import java.util.Scanner;
public class returnmove {

    /*의사 코드
     * 1. dx, dy의 값을 배열에 넣어둔다.
     * 2. 값이 이동할 때마다 count++을 해준다.
     * 3. nx, ny가 0이 되어지면 멈추고 result값을 반환한다.
     * 4. 반복문이 끝날때 까지 0이 되어지지 않으면 -1을 반환한다.
     */
// 6
// N 3
// E 2
// S 3
// W 4
// S 5
// E 8
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nx=0, ny=0;
        int dirNum;
        int count = 0;
        int result = -1;

        // 인덱스 0=동 / 1=북 / 2=서 / 3=남
        int[] dx = new int[]{1, 0, -1, 0}; //동 북 서 남
        int[] dy = new int[]{0, 1, 0, -1}; //동 북 서 남


        int n = sc.nextInt();
        for(int i=0;i<n;i++){

            char direction = sc.next().charAt(0);
            int move = sc.nextInt();

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

            for(int j=0; j<move;j++){ // 얼마나 이동하는지에 대한 반복문
                nx += dx[dirNum];
                ny += dy[dirNum];

                count++; // 초 증가

                if(nx == 0 && ny == 0){ // 종료 조건
                    result = count;
                    System.out.println(result);
                    return;
                }

            }
            
        }
        System.out.println(result); // 값 반환
    }
}
