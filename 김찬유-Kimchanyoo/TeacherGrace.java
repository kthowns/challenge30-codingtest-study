import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
의사코드
1. 선생님이 선물을 줄 학생의 수 N과 예산 B를 입력받는다
2. 각 학생들마다 희망하는 선물의 가격을 입력받아 ArrayList에 넣는다
3. 입력받은 학생들의 선물 가격을 오름차순으로 정렬한다
4. 2중 반복문을 사용한다
    4-1. 선물 가능한 학생의 수(count)와 선물했을 때의 최대 가격(sumPrice)을 0으로 초기화시킨다
    4-2. 만약 i와 j의 값이 같다면 j번째의 값을 선물할 가격에 더할 때 반값으로 할인, 즉 2로 나누고 더한다
    4-3. i와 j의 값이 다르다면 sumPrice에 배열의 j번째 값을 더해준다
    4-4. 만약 sumPrice가 예산 B를 초과하게 되면 그 순간에 break;를 수행하고 count의 횟수가 최대인지 판별한다
    4-5. sumPrice가 예산 B를 초과하지 않는다면 다시 for문을 반복한다
5. count를 출력한다
 */
public class TeacherGrace {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> giftPrice = new ArrayList<>();
    static int maxNumber = Integer.MIN_VALUE;
    public static void main(String[] args){
        int N = sc.nextInt();
        int B = sc.nextInt();

        for(int i = 0; i < N; i++){
            int price = sc.nextInt();
            giftPrice.add(price);
        }
        Collections.sort(giftPrice);

        calculatePossibleNumber(B);
        
        System.out.println(maxNumber);
    }

    /**
     * 선생님이 선물을 줄 수 있는 최대 학생의 수를 구하는 함수
     * @param B 예산
     */
    private static void calculatePossibleNumber(int B) {
        for(int i = 0; i < giftPrice.size(); i++){
            int count = 0;
            int sumPrice = 0;
            for(int j = 0; j < giftPrice.size(); j++){
                if(j == i){
                    sumPrice = sumPrice + (giftPrice.get(j) / 2);
                }
                else{
                    sumPrice = sumPrice + giftPrice.get(j);
                }
                if(sumPrice <= B){
                    count++;
                }
                else{
                    break;
                }
            }
            maxNumber = Math.max(maxNumber, count);
        }
    }
}
