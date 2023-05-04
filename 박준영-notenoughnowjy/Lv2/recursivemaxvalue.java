package Lv2;

/*
 * 의사 코드
 * 1. Max_N으로 배열을 선언해준다. -> 배열이 오버플로우 되지 않기 위해 넉넉하게 해준다.
 * 2. a == 0이 되면 list[0]번째 값을 반환해준다.
 * 3. Matt_max(a, b)는 매개변수 'a' 와 'b' 중에서 더 큰 값을 반환한다.
 * 4. max_value(a-1)과 list[a]중 더 큰 값을 반환해준다.
 * 5. max_value(4)까지 호출되어지고, max_value(3), (2), (1), (0)을 반환해서 if(a==0)이 되어서 재귀함수가 끝나게 된다.
 */

import java.util.Scanner;

public class recursivemaxvalue {
    public static int Max_N = 100;
    public static int[] list = new int[Max_N];

    public static int max_value(int a){
        if(a == 0){
            return list[0];
        }
        return Math.max(max_value(a - 1), list[a]);
    }

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            list[i] = sc.nextInt();

        }
        System.out.print(max_value(n - 1));

    }
    
}
