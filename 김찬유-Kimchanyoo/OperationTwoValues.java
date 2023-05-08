import java.util.*;
/*
의사코드
1. 입력 값 2개를 작성
2. 2개의 값 비교 
3. 둘 중 작은 수에 10을 더하고 큰 수에 2를 곱함
4. 2개의 값을 출력
*/
public class OperationTwoValues {
    private static int[] calculateNum(int num1,int num2){
        int[] numList = {num1, num2};
        if(num1 < num2){
            numList[0] = num1 + 10;
            numList[1] = num2 * 2;
        }
        else{
            numList[1] = num2 + 10;
            numList[0] = num1 * 2;
        }
        return numList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] resultNumbers = calculateNum(a,b);
        System.out.printf("%d %d",resultNumbers[0],resultNumbers[1]);
    }
}