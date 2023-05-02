import java.util.Scanner;
/*
의사코드
1. 수열의 원소 수 n과 계산을 위한 순서쌍의 개수 m을 입력
2. n만큼 수열에 원소를 할당
3. 순서쌍을 m만큼 반복하여 입력받음
    3-1. 입력받을때마다 순서쌍 a1부터 a2까지의 원소의 합을 출력하는 printCalculate()함수 호출
*/
public class SumOfIntervers {
    static int NumberList[];
    private static void printCalculate(int num1, int num2, int[] numList){
        int sum = 0;
        for(int i = num1-1; i < num2; i++){
            sum += numList[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        NumberList = new int[n];
        for(int i = 0; i < n; i++){
            NumberList[i] = sc.nextInt();
        }
        int a1, a2;
        for(int j = 0; j < m; j++){
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            printCalculate(a1, a2, NumberList);
        }
    }
}