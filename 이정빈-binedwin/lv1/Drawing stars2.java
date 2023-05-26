/*
* 정수 n을 입력 받습니다.
* 다이아몬드의 중간을 기준으로 위의 삼각형을 먼저 출력합니다.
* 다음으로 밑에 부분의 삼각형을 출력합니다.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j =n-i-1; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j =0; j<i+1; j++){
                System.out.print(" ");
            }
            for(int k=(n-i-1)*2-1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
