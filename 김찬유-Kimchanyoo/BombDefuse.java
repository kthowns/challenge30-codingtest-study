import java.util.*;

/**
 * 폭탄에 대한 정보를 다루는 클래스
 * 해체코드, 끊어야하는 선의 색, 특정 초를 제공해준다
 */
class Bomb{
    String code;
    String color;
    int second;
    Bomb(String code, String color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }

    /**
     * 폭탄에 관한 정보를 출력하는 함수
     */
    public void printBomb(){
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + second);
    }
}
public class BombDefuse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();
        Bomb bomb = new Bomb(code, color, second);

        bomb.printBomb();
    }
}
