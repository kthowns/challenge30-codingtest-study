import java.util.*;
/*
의사코드
1. 정수 n을 입력한다
2. n만큼의 별을 출력하는 printStar()를 재귀적 호출
3. 1부터 다시 n까지 출력
*/
public class NonReturningRecursive {
    private static void printStar(int num){
        for(int i = num;i > 0;i--){
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println();
        if(num == 1){
            System.out.print("*");
            System.out.println();
            return;
        }
        else{
            num -= 1;
            printStar(num);
        }
        for(int j = num+1; j >0; j--){
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printStar(N);
    }
}