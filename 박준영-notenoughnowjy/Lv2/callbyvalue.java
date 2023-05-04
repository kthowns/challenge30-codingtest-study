package Lv2;

import java.util.Scanner;

public class callbyvalue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();int b = sc.nextInt(); //값 입력받기
        /* 의사 코드
         * 1. a와 b의 값을 입력받는다
         * 2. a가 b보다 작으면 a의 값에 10을 더하고 b의 값에 2를 곱한다.
         * 3. 다른 경우는 b의 값에 10을 더하고 a의 값에 2를 곱한다.
         */
        if(a>=1 && b<=200){
            if(a<b){ //a가 b보다 작으면
                a = a+10;
                b = b*2;
                System.out.print(a + " " + b);
            }
            else{ //다른 경우(a가 b보다 크거나 같으면) -> 같은 경우 고칠 필요가 있음 
                b = b+10;
                a = a*2;
                System.out.print(b + " " + a);
            }
        }

    }
}.
