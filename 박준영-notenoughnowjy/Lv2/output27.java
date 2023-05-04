package Lv2;

public class output27{
/*
 * 의사코드
 * ?는 b>0이라는 조건일때 true 일 시 f(b, a%b)+b를 반환하고, false일 시 0을 반환한다.
 * b의 값은 a%b에 따라 바뀌면서 뒤의 b도 계속해서 더해지는 형식으로 이해를 했다.
 * b가 0이 될 때까지 반복했고 모든 값을 얻는다.
 */
    public static int f(int a, int b){
        return b > 0 ? f(b, a%b) + b : 0; //반복 return
            
    }
    public static void main(String[] args){

        // 직접 출력하지 않고 풀어서 출력했다.

        // System.out.println(f(21, 34)); //결과적인 값을 출력
        // System.out.println(f(123,12));
        // System.out.println(f(2021,4));
        // System.out.println(f(107, 36));
        // System.out.println(f(66,60));
    }
}