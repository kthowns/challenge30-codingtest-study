package Lv3;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 의사 코드
 * 1. N을 입력받고 2배의 배열을 입력받는다.
 * 2. 값을 넣어 줄 list[] 배열을 선언해준다.
 * 3. list에 값을 넣어준다.
 * 4. list를 0번째부터 2*N까지 정렬해준다.
 * -> 여기서 단순히 Arrays.sort(list)로 정렬한다면 인덱스 번호를 사용하지 못했다. -> 이것때문에 20분 소모..
 * 5. sum과 max를 선언해준다.
 * 6. sum값에 list[i] 값과 list[2*N-1-i]의 값을 더해준다.
 * 7. 만약 sum값이 max값 보다 크다면 max값은 sum값이 되어진다.
 * 8. 이렇게 구현한 이유는 정렬 후 맨 앞 값과 맨 뒤의 값을 더한 것 중 가장 큰 값이 이 문제의 답이기 때문이다.
 */
public class twogroupe {
    public static void main(String[] args){
        int Max_N = 100;
        int[] list = new int[Max_N];

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<2*N; i++){
            list[i] = sc.nextInt();
        }

        Arrays.sort(list, 0, 2 * N);

        int sum = 0;
        int max = 0;
        for(int i=0;i<N;i++){
            sum = list[i] + list[2*N-1-i];
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }
    
}
