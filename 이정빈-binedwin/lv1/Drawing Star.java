/*
* 정수 n을 입력받습니다.
* 첫 번째 for문은 줄 개수
* 두 번째 for문은 별의 문단 개수
* 세 번째 for문은 별의 개수
* " " 을 통해 문단 사이에 공백을 줍니다.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=1; i<=n; i++){
        for(int j=n-i; j>=0; j--){
             for(int k=n-i; k>=0; k--){
                System.out.print("*");
            }
            System.out.print(" ");
        }
             System.out.println();
        }
        
    }
}
