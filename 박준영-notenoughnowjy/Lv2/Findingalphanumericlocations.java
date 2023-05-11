
/*
 * 숫자의 위치가 어디 자리로 이동했는지에 대해서 출력하는 프로그램
 * 5
 * 3 4 2 1 5
 * 3 4 2 1 5 가 출력이 될 것.
 * 
 * 7 
 * 3 1 6 2 7 30 1
 * 
 * -> 숫자를 정렬하고 각 숫자의 현재 인덱스를 출력하면 될 것 같다.
 */

import java.util.Arrays;
import java.util.Scanner;

class Index implements Comparable<Index>{
    int number;
    int index;

    public Index(int number, int index){
        this.number = number;
        this.index = index;
    }

    public int compareTo(Index in){
        if(number != in.number ){
            return number - in.number;
        }
        return index - in.index;
    }
 }


 /*
  * 의사 코드
  1. 값 받기
  2. 각 값의 인덱스를 미리 받기
  3. 정렬하기
  4. 이동 후의 인덱스 값에 대해서 각 자리에 출력하기.
  */
public class Findingalphanumericlocations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int value;
        int[] result = new int[200];
        
        Index[] indexs = new Index[200];


        //값을 입력받고, 값마다 인덱스를 저장한다.
        for(int i=0;i<n;i++){
            value = sc.nextInt();
            indexs[i] = new Index(value, i);
        }

        // 인덱스를 정렬한다.
        Arrays.sort(indexs, 0, n);

        // 각 인덱스에 저장된 인덱스 번호를 결과 배열에 저장해준다.
        for(int i=0;i<n;i++){
            result[indexs[i].index] = i+1;

        }

        //출력한다.
        for(int i=0;i<n;i++){
            System.out.print(result[i] + " ");
        }
    } 
}
