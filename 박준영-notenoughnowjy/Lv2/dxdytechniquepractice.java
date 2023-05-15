public class dxdytechniquepractice {

    /*
     * (x, y) 위치에서 시작하여 한 칸 이동하려 합니다.
     * 숫자 0이 주어지면 동쪽으로,
     * 숫자 1이 주어지면 남쪽으로,
     * 숫자 2가 주어지면 서쪽으로,
     * 숫자 3이 주어지면 북쪽으로 이동하려 합니다.
     */
    public static void main(String[] args){

        // int dirNum = 2;
        // int x = 1, y = 5;
        // int nx, ny;

        // if(dirNum == 0){ // 동쪽으로 이동
        //     nx = x+1; ny = y;
        // }
        // else if(dirNum==1){ // 남쪽으로 이동
        //     nx = x; ny = y - 1;
        // }
        // else if(dirNum==1){ // 서쪽으로 이동
        //     nx = x - 1; ny = y;
        // }
        // else{ // 북쪽으로 이동(숫자 3이 주어짐)
        //     nx = x; ny = y+1;
        // }
        /*
         * 위의 코드는 비슷해보이는 코드가 반복되어진다.
         * 특정 방향에 대해 이동하는 경우에 대해서는 dx, dy 테크닉을 많이 사용한다.
         */

         int dirNum = 2; //주어진 방향이 서쪽인 경우
         int x = 1, y = 5; // 현재 위치가 (1,5)인 경우

         int[] dx = new int[]{1,0,-1,0}; //동쪽은 1, 서쪽은 -1, 남쪽과 북쪽은 x축이 0만큼 이동
         int[] dy = new int[]{0,-1,0,1}; //남쪽은 -1, 북쪽은 1, 동쪽과 서쪽은 y축이 0만큼 이동

         int nx, ny;

        //  if(dirNum == 0) {
        //     nx = x + dx[0]; ny = y + dy[0];
        // }
        // else if(dirNum == 1) {
        //     nx = x + dx[1]; ny = y + dy[1];
        // }
        // else if(dirNum == 2) {
        //     nx = x + dx[2]; ny = y + dy[2];
        // }
        // else {
        //     nx = x + dx[3]; ny = y + dy[3];
        // }

        /*
         * 위의 코드를 짧게 표현하면
         */

         nx = x + dx[dirNum];
         ny = y + dy[dirNum];
         System.out.println("("+nx+","+ny+")");
    }
}
