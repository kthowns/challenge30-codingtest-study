package Lv2;

public class output52 {
    
    /*
     * 의사코드
     * 1. x/3은 몫을 나타낸다
     * 2. y*3으로 곱해진다.
     * 3. x%3 * y 값이 계속해서 더해진다
     * 4. 출력되어진다.
     */

    public static int f(int x, int y){
        if(x==0) return 0;
        return f(x/3, y*3) + x%3 * y;
    }

    public static void main(String[] args){

        System.out.println(f(215,5));
    }
}
