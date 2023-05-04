package Lv2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 의사 코드
 * 1. 두 개의 동일한 수열
 * 2. n개의 원소 -> max값 설정 후 n개의 for()문에 설정해준다.
 * 3. 수얼값을 입력할 수 있게 for(i<n)으로 설정해준다.
 * 4. Arrays.sort로 정렬 후 비교한다.
 */
public class twoequalseries {
    public static void main(String[] args){

        int Max_N = 100;
        int[] A = new int[Max_N];
        int[] B = new int[Max_N];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        boolean Same = true;
        for(int i=0; i<n;i++){
            if(A[i] != B[i]){
                Same = false;
                break;
            }
        }
        if(Same){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

     }
}

