package Lv2;
import java.util.Scanner;

public class recursivemul {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];

        //재귀함수를 이용한 최소공배수
        //미해결
        //다소 공부가 필요

        if(n>=1 && n<=10){
            for(int i=0;i<n;i++){
                array[i] = sc.nextInt();
            }
        }
    }
}
