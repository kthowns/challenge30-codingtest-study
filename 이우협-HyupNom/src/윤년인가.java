import java.util.Scanner;
public class 윤년인가 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int y;
            y = sc.nextInt();
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) { //삼항 연산자 사용으로 4,100,400의 배수가 되는 년을 윤년으로
                System.out.println("true");
            } else
                System.out.println("false");
        }
    }

