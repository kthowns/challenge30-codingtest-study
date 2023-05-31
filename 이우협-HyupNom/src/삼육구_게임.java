
import java.util.Scanner;
public class 삼육구_게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0)
                System.out.print("0 ");
            else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) { //3,6,9의 배수 거르기
                System.out.print("0 ");
            } else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) { //3,6,9로 끝나는 수 거르기
                System.out.print("0 ");
            } else
                System.out.print(i + " ");
        }
    }
}
