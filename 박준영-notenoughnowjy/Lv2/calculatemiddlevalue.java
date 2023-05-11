package Lv3;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 의사 코드
 * 1. list에 값을 입력받는다.
 * 2. 중앙값은 N의 N/2+1 값까지만 출력받으면 된다.
 * 3. 출력해준다. -> 비교적 쉬웠다.
 */
public class calculatemiddlevalue {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int Max_N = 100;
        int[] list = new int[Max_N];
        int N = sc.nextInt();
        
        for(int i=0;i<N;i++){
            list[i] = sc.nextInt();
        }
        Arrays.sort(list, 0, N);

        for(int i=0;i<N/2+1;i++){
            System.out.print(list[i] + " ");
        }
    }
}
