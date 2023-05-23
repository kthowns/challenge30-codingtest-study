/*
* n을 입력 받습니다.
* 줄이 바뀌면서 공백의 개수는 줄어들고 문자의 개수는 늘어납니다.
* 문재의 개수가 n의 값과 같아지는 이후로
  공백의 개수는 늘어나고 문자의 개수는 줄어듭니다.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print("  ");
            for(int j = 0; j <= i; j++)
                System.out.print("@ ");
            System.out.println();
        }
    
        for(int i = n - 2; i >= 0; i--) {
            for(int j = 0; j <= i; j++)
                System.out.print("@ ");
            System.out.println();
        }
    }
}
